// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.RVPIndicator;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubCategoryListActivity_ViewBinding<T extends SubCategoryListActivity> implements Unbinder {
  protected T target;

  @UiThread
  public SubCategoryListActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mIndicator = Utils.findRequiredViewAsType(source, R.id.indicatorSub, "field 'mIndicator'", RVPIndicator.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewpagerSub, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mIndicator = null;
    target.mViewPager = null;

    this.target = null;
  }
}
