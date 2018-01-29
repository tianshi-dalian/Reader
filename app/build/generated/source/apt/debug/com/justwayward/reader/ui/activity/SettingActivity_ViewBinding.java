// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingActivity_ViewBinding<T extends SettingActivity> implements Unbinder {
  protected T target;

  private View view2131230752;

  private View view2131230919;

  private View view2131230799;

  private View view2131230768;

  @UiThread
  public SettingActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mTvSort = Utils.findRequiredViewAsType(source, R.id.mTvSort, "field 'mTvSort'", TextView.class);
    target.mTvFlipStyle = Utils.findRequiredViewAsType(source, R.id.tvFlipStyle, "field 'mTvFlipStyle'", TextView.class);
    target.mTvCacheSize = Utils.findRequiredViewAsType(source, R.id.tvCacheSize, "field 'mTvCacheSize'", TextView.class);
    target.noneCoverCompat = Utils.findRequiredViewAsType(source, R.id.noneCoverCompat, "field 'noneCoverCompat'", SwitchCompat.class);
    view = Utils.findRequiredView(source, R.id.bookshelfSort, "method 'onClickBookShelfSort'");
    view2131230752 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBookShelfSort();
      }
    });
    view = Utils.findRequiredView(source, R.id.rlFlipStyle, "method 'onClickFlipStyle'");
    view2131230919 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFlipStyle();
      }
    });
    view = Utils.findRequiredView(source, R.id.feedBack, "method 'feedBack'");
    view2131230799 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.feedBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.cleanCache, "method 'onClickCleanCache'");
    view2131230768 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCleanCache();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTvSort = null;
    target.mTvFlipStyle = null;
    target.mTvCacheSize = null;
    target.noneCoverCompat = null;

    view2131230752.setOnClickListener(null);
    view2131230752 = null;
    view2131230919.setOnClickListener(null);
    view2131230919 = null;
    view2131230799.setOnClickListener(null);
    view2131230799 = null;
    view2131230768.setOnClickListener(null);
    view2131230768 = null;

    this.target = null;
  }
}
