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
import android.widget.ListView;

import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseActivity;
import com.justwayward.reader.component.AppComponent;
import com.justwayward.reader.component.DaggerMainComponent;
import com.justwayward.reader.ui.adapter.MessageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 消息页面
 * MessageActivity
 *
 * @author tianshi
 * @time 2018/1/29 0029 13:35
 */
public class MessageActivity extends BaseActivity {


    @BindView(R.id.lv_01)
    ListView lv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        MessageAdapter adapter = new MessageAdapter(this);
        lv01.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MessageActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_message;
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
        mCommonToolbar.setTitle("消息列表");
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
