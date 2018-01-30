/**
 * Copyright (c) 2016, smuyyh@gmail.com All Rights Reserved.
 * #                                                   #
 * #                       _oo0oo_                     #
 * #                      o8888888o                    #
 * #                      88" . "88                    #
 * #                      (| -_- |)                    #
 * #                      0\  =  /0                    #
 * #                    ___/`---'\___                  #
 * #                  .' \\|     |# '.                 #
 * #                 / \\|||  :  |||# \                #
 * #                / _||||| -:- |||||- \              #
 * #               |   | \\\  -  #/ |   |              #
 * #               | \_|  ''\---/''  |_/ |             #
 * #               \  .-\__  '-'  ___/-. /             #
 * #             ___'. .'  /--.--\  `. .'___           #
 * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * #                       `=---='                     #
 * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * #                                                   #
 * #               佛祖保佑         永无BUG             #
 * #                                                   #
 */
package com.justwayward.reader.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseActivity;
import com.justwayward.reader.base.Constant;
import com.justwayward.reader.bean.QQInformationBean;
import com.justwayward.reader.bean.user.TencentLoginResult;
import com.justwayward.reader.component.AppComponent;
import com.justwayward.reader.component.DaggerMainComponent;
import com.justwayward.reader.manager.EventManager;
import com.justwayward.reader.manager.SettingManager;
import com.justwayward.reader.service.DownloadBookService;
import com.justwayward.reader.ui.contract.MainContract;
import com.justwayward.reader.ui.fragment.CommunityFragment;
import com.justwayward.reader.ui.fragment.FindFragment;
import com.justwayward.reader.ui.fragment.RecommendFragment;
import com.justwayward.reader.ui.presenter.MainActivityPresenter;
import com.justwayward.reader.utils.LogUtils;
import com.justwayward.reader.utils.SharedPreferencesUtil;
import com.justwayward.reader.utils.StringUtils;
import com.justwayward.reader.utils.ToastUtils;
import com.justwayward.reader.utils.Util;
import com.justwayward.reader.view.GenderPopupWindow;
import com.justwayward.reader.view.LoginPopupWindow;
import com.justwayward.reader.view.RVPIndicator;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * https://github.com/JustWayward/BookReader
 */
public class MainActivity extends BaseActivity implements MainContract.View, LoginPopupWindow.LoginTypeListener {

    @BindView(R.id.indicator)
    RVPIndicator mIndicator;
    @BindView(R.id.viewpager)
    ViewPager mViewPager;
    @BindView(R.id.common_toolbar)
    Toolbar commonToolbar;

    private List<Fragment> mTabContents;
    private FragmentPagerAdapter mAdapter;
    private List<String> mDatas;

    @Inject
    MainActivityPresenter mPresenter;

    // 退出时间
    private long currentBackPressedTime = 0;
    // 退出间隔
    private static final int BACK_PRESSED_INTERVAL = 2000;

    private LoginPopupWindow popupWindow;
    public static Tencent mTencent;
    public IUiListener loginListener;
    private GenderPopupWindow genderPopupWindow;
    MenuItem menuItem;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            if (null != SharedPreferencesUtil.getInstance().getString(Constant.NAME) && !"".equals(SharedPreferencesUtil.getInstance().getString(Constant.NAME))) {
                menuItem.setTitle(SharedPreferencesUtil.getInstance().getString(Constant.NAME));

            } else {
                menuItem.setTitle("请登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initToolBar() {
        mCommonToolbar.setLogo(R.mipmap.ic_launcher);
        setTitle("读书吧");

    }

    public void pullSyncBookShelf() {
        mPresenter.syncBookShelf();
    }

    @Override
    public void initDatas() {
        startService(new Intent(this, DownloadBookService.class));

        mTencent = Tencent.createInstance("1105670298", MainActivity.this);

        mDatas = Arrays.asList(getResources().getStringArray(R.array.home_tabs));
        mTabContents = new ArrayList<>();
        mTabContents.add(new RecommendFragment());
        mTabContents.add(new CommunityFragment());
        mTabContents.add(new FindFragment());

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return mTabContents.size();
            }

            @Override
            public Fragment getItem(int position) {
                return mTabContents.get(position);
            }
        };
    }

    @Override
    public void configViews() {
        mIndicator.setTabItemTitles(mDatas);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(3);
        mIndicator.setViewPager(mViewPager, 0);

        mPresenter.attachView(this);

        mIndicator.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!SettingManager.getInstance().isUserChooseSex()
                        && (genderPopupWindow == null || !genderPopupWindow.isShowing())) {
                    showChooseSexPopupWindow();
                } else {
                    showDialog();
                    mPresenter.syncBookShelf();
                }
            }
        }, 500);
    }

    public void showChooseSexPopupWindow() {
        if (genderPopupWindow == null) {
            genderPopupWindow = new GenderPopupWindow(MainActivity.this);
        }
        if (!SettingManager.getInstance().isUserChooseSex()
                && !genderPopupWindow.isShowing()) {
            genderPopupWindow.showAtLocation(mCommonToolbar, Gravity.CENTER, 0, 0);
        }
    }

    public void setCurrentItem(int position) {
        mViewPager.setCurrentItem(position);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menuItem = menu.findItem(R.id.action_login);
        if (null != SharedPreferencesUtil.getInstance().getString(Constant.NAME) && !"".equals(SharedPreferencesUtil.getInstance().getString(Constant.NAME))) {
            menuItem.setTitle(SharedPreferencesUtil.getInstance().getString(Constant.NAME));

        } else {
            menuItem.setTitle("请登录");
        }
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                break;
            case R.id.action_login:
                //检查是否登录，如果登录了则跳转到个人信息页面，否则跳转登录
                if (null != SharedPreferencesUtil.getInstance().getString(Constant.NAME) && !"".equals(SharedPreferencesUtil.getInstance().getString(Constant.NAME))) {
                    //跳转到个人信息页面
                    startActivity(new Intent(MainActivity.this, InformationActivity.class));
                } else {
                    if (popupWindow == null) {
                        popupWindow = new LoginPopupWindow(this);
                        popupWindow.setLoginTypeListener(this);
                    }
                    popupWindow.showAtLocation(mCommonToolbar, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.action_my_message:
                //检查是否登录，如果登录了则跳转到消息页面，否则提示登录
                if (null != SharedPreferencesUtil.getInstance().getString(Constant.NAME) && !"".equals(SharedPreferencesUtil.getInstance().getString(Constant.NAME))) {
                    //跳转到个人信息页面
                    startActivity(new Intent(MainActivity.this, MessageActivity.class));
                } else {
                    ToastUtils.showToast("请先登录");
                }
                break;
            case R.id.action_sync_bookshelf:
                showDialog();
                mPresenter.syncBookShelf();
               /* if (popupWindow == null) {
                    popupWindow = new LoginPopupWindow(this);
                    popupWindow.setLoginTypeListener(this);
                }
                popupWindow.showAtLocation(mCommonToolbar, Gravity.CENTER, 0, 0);*/
                break;
            case R.id.action_scan_local_book:
                ScanLocalBookActivity.startActivity(this);
                break;
            case R.id.action_wifi_book:
                WifiBookActivity.startActivity(this);
                break;
            case R.id.action_feedback:
                FeedbackActivity.startActivity(this);
                break;
            case R.id.action_night_mode:
                if (SharedPreferencesUtil.getInstance().getBoolean(Constant.ISNIGHT, false)) {
                    SharedPreferencesUtil.getInstance().putBoolean(Constant.ISNIGHT, false);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    SharedPreferencesUtil.getInstance().putBoolean(Constant.ISNIGHT, true);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                recreate();
                break;
            case R.id.action_settings:
                SettingActivity.startActivity(this);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN
                && event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - currentBackPressedTime > BACK_PRESSED_INTERVAL) {
                currentBackPressedTime = System.currentTimeMillis();
                ToastUtils.showToast(getString(R.string.exit_tips));
                return true;
            } else {
                finish(); // 退出
            }
        } else if (event.getKeyCode() == KeyEvent.KEYCODE_MENU) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    /**
     * 显示item中的图片；
     *
     * @param view
     * @param menu
     * @return
     */
    @SuppressLint("RestrictedApi")
    @Override
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        if (menu != null) {
            if (menu.getClass() == MenuBuilder.class) {
                try {
                    Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                    m.setAccessible(true);
                    m.invoke(menu, true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    public void loginSuccess() {
        ToastUtils.showSingleToast("登陆成功");
    }

    @Override
    public void syncBookShelfCompleted() {
        dismissDialog();
        EventManager.refreshCollectionList();
    }

    @Override
    public void onLogin(ImageView view, String type) {
        if (type.equals("QQ")) {
//            if (!mTencent.isSessionValid()) {
                if (loginListener == null) loginListener = new BaseUIListener();
                mTencent.login(this, "all", loginListener);
//            }
        }
        //4f45e920ff5d1a0e29d997986cd97181
    }

    @Override
    public void showError() {
        ToastUtils.showSingleToast("同步异常");
        dismissDialog();
    }

    @Override
    public void complete() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


    public class BaseUIListener implements IUiListener {

        @Override
        public void onComplete(Object o) {
            JSONObject jsonObject = (JSONObject) o;
            String json = jsonObject.toString();
            Gson gson = new Gson();
            TencentLoginResult result = gson.fromJson(json, TencentLoginResult.class);
            LogUtils.e(result.toString());
//            mPresenter.login(result.openid, result.access_token, "QQ");

            //设置openid和token，否则获取不到下面的信息
            initOpenidAndToken(jsonObject);
            //获取QQ用户的各信息
            getUserInfo();

        }

        @Override
        public void onError(UiError uiError) {
        }

        @Override
        public void onCancel() {

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.REQUEST_LOGIN || requestCode == Constants.REQUEST_APPBAR) {
            Tencent.onActivityResultData(requestCode, resultCode, data, loginListener);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DownloadBookService.cancel();
        stopService(new Intent(this, DownloadBookService.class));
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    private void initOpenidAndToken(JSONObject jsonObject) {
        try {
            String openid = jsonObject.getString("openid");
            String token = jsonObject.getString("access_token");
            String expires = jsonObject.getString("expires_in");

            mTencent.setAccessToken(token, expires);
            mTencent.setOpenId(openid);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void getUserInfo() {

        //sdk给我们提供了一个类UserInfo，这个类中封装了QQ用户的一些信息，我么可以通过这个类拿到这些信息
        QQToken mQQToken = mTencent.getQQToken();
        UserInfo userInfo = new UserInfo(MainActivity.this, mQQToken);
        userInfo.getUserInfo(new IUiListener() {
                                 @Override
                                 public void onComplete(final Object o) {
                                     JSONObject userInfoJson = (JSONObject) o;
                                     Message msgNick = new Message();
                                     msgNick.what = 0;//昵称
                                     try {
                                         QQInformationBean qqInformationBean = new QQInformationBean();
                                         qqInformationBean.setGender(userInfoJson.getString("gender"));
                                         qqInformationBean.setProvince(userInfoJson.getString("province"));
                                         qqInformationBean.setCity(userInfoJson.getString("city"));
                                         qqInformationBean.setFigureurl_qq_1(userInfoJson.getString("figureurl_qq_1"));
                                         qqInformationBean.setNickName(userInfoJson.getString("nickname"));
                                         msgNick.obj = qqInformationBean;
                                     } catch (JSONException e) {
                                         e.printStackTrace();
                                     }
                                     mHandler.sendMessage(msgNick);
                                     //子线程 获取并传递头像图片，由Handler更新
                                     new Thread(new Runnable() {
                                         @Override
                                         public void run() {
                                             Bitmap bitmapHead = null;
                                             if (((JSONObject) o).has("figureurl")) {
                                                 try {
                                                     String headUrl = ((JSONObject) o).getString("figureurl_qq_2");
                                                     bitmapHead = Util.getbitmap(headUrl);
                                                 } catch (JSONException e) {
                                                     e.printStackTrace();
                                                 }
                                                 Message msgHead = new Message();
                                                 msgHead.what = 1;
                                                 msgHead.obj = bitmapHead;
                                                 mHandler.sendMessage(msgHead);
                                             }
                                         }
                                     }).start();

                                 }

                                 @Override
                                 public void onError(UiError uiError) {
                                     Log.e("GET_QQ_INFO_ERROR", "获取qq用户信息错误");
                                     Toast.makeText(MainActivity.this, "获取qq用户信息错误", Toast.LENGTH_SHORT).show();
                                 }

                                 @Override
                                 public void onCancel() {
                                     Log.e("GET_QQ_INFO_CANCEL", "获取qq用户信息取消");
                                     Toast.makeText(MainActivity.this, "获取qq用户信息取消", Toast.LENGTH_SHORT).show();
                                 }
                             }
        );
    }

    //显示获取到的头像和昵称
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {//获取昵称
//                tvNickName.setText((CharSequence) msg.obj);
                QQInformationBean qqInformationBean = (QQInformationBean) msg.obj;
                SharedPreferencesUtil.getInstance().putString(Constant.NAME, qqInformationBean.getNickName());
                SharedPreferencesUtil.getInstance().putString(Constant.gender, qqInformationBean.getGender());
                SharedPreferencesUtil.getInstance().putString(Constant.address, qqInformationBean.getProvince() + "  " + qqInformationBean.getCity());
                SharedPreferencesUtil.getInstance().putString(Constant.headPicture, qqInformationBean.getFigureurl_qq_1());
                ToastUtils.showToast("登录成功");
                menuItem.setTitle(SharedPreferencesUtil.getInstance().getString(Constant.NAME));
            } else if (msg.what == 1) {//获取头像
//                headerLogo.setImageBitmap((Bitmap) msg.obj);
            }
        }
    };
}