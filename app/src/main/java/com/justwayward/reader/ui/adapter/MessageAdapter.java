package com.justwayward.reader.ui.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.justwayward.reader.R;

import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 消息列表
 * MessageAdapter
 *
 * @author tianshi
 * @time 2018/1/29 0029 13:38
 */

public class MessageAdapter extends BaseAdapter {
    public Activity activity;


    /**
     * 构造方法
     */
    public MessageAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 100;
    }


    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(activity).inflate(R.layout.item_message, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv01.setText("我是第" + position + "条消息，消息内容：重要通知，2月15日为大年三十。。。。");

        return convertView;
    }


    static class ViewHolder {
        @BindView(R.id.tv_01)
        TextView tv01;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);

        }
    }

}
