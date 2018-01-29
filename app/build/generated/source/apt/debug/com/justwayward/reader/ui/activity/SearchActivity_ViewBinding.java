// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseRVActivity_ViewBinding;
import com.justwayward.reader.view.TagGroup;
import java.lang.Override;

public class SearchActivity_ViewBinding<T extends SearchActivity> extends BaseRVActivity_ViewBinding<T> {
  private View view2131231012;

  @UiThread
  public SearchActivity_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    target.mTvChangeWords = Utils.findRequiredViewAsType(source, R.id.tvChangeWords, "field 'mTvChangeWords'", TextView.class);
    target.mTagGroup = Utils.findRequiredViewAsType(source, R.id.tag_group, "field 'mTagGroup'", TagGroup.class);
    target.mRootLayout = Utils.findRequiredViewAsType(source, R.id.rootLayout, "field 'mRootLayout'", LinearLayout.class);
    target.mLayoutHotWord = Utils.findRequiredViewAsType(source, R.id.layoutHotWord, "field 'mLayoutHotWord'", RelativeLayout.class);
    target.rlHistory = Utils.findRequiredViewAsType(source, R.id.rlHistory, "field 'rlHistory'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.tvClear, "field 'tvClear' and method 'clearSearchHistory'");
    target.tvClear = Utils.castView(view, R.id.tvClear, "field 'tvClear'", TextView.class);
    view2131231012 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearSearchHistory();
      }
    });
    target.lvSearchHistory = Utils.findRequiredViewAsType(source, R.id.lvSearchHistory, "field 'lvSearchHistory'", ListView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mTvChangeWords = null;
    target.mTagGroup = null;
    target.mRootLayout = null;
    target.mLayoutHotWord = null;
    target.rlHistory = null;
    target.tvClear = null;
    target.lvSearchHistory = null;

    view2131231012.setOnClickListener(null);
    view2131231012 = null;
  }
}
