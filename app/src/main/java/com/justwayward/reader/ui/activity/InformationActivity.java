/**
 * Copyright 2016 JustWayward Team
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.justwayward.reader.ui.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseActivity;
import com.justwayward.reader.base.Constant;
import com.justwayward.reader.component.AppComponent;
import com.justwayward.reader.component.DaggerMainComponent;
import com.justwayward.reader.utils.SharedPreferencesUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 个人信息页面
 * InformationActivity
 *
 * @author tianshi
 * @time 2018/1/29 0029 13:01
 */
public class InformationActivity extends BaseActivity {


    @BindView(R.id.iv_01)
    ImageView iv01;
    @BindView(R.id.tv_nickName)
    TextView tvNickName;
    @BindView(R.id.tv_gender)
    TextView tvGender;
    @BindView(R.id.tv_address)
    TextView tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        Glide.with(mContext).load(SharedPreferencesUtil.getInstance().getString(Constant.headPicture)).placeholder(R.drawable.cover_default).into(iv01);
        tvNickName.setText(SharedPreferencesUtil.getInstance().getString(Constant.NAME));
        tvGender.setText(SharedPreferencesUtil.getInstance().getString(Constant.gender));
        tvAddress.setText(SharedPreferencesUtil.getInstance().getString(Constant.address));
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, InformationActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_information;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }


    @Override
    public void initToolBar() {
        mCommonToolbar.setTitle("个人信息");
        mCommonToolbar.setNavigationIcon(R.drawable.ab_back);

    }

    @Override
    public void initDatas() {

    }

    /**
     * 对各种控件进行设置、适配、填充数据
     */
    @Override
    public void configViews() {

    }


}
