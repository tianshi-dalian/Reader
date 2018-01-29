// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.RVPIndicator;
import com.justwayward.reader.view.ReboundScrollView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubjectBookListActivity_ViewBinding<T extends SubjectBookListActivity> implements Unbinder {
  protected T target;

  @UiThread
  public SubjectBookListActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mIndicator = Utils.findRequiredViewAsType(source, R.id.indicatorSubject, "field 'mIndicator'", RVPIndicator.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewpagerSubject, "field 'mViewPager'", ViewPager.class);
    target.rsvTags = Utils.findRequiredViewAsType(source, R.id.rsvTags, "field 'rsvTags'", ReboundScrollView.class);
    target.rvTags = Utils.findRequiredViewAsType(source, R.id.rvTags, "field 'rvTags'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mIndicator = null;
    target.mViewPager = null;
    target.rsvTags = null;
    target.rvTags = null;

    this.target = null;
  }
}
