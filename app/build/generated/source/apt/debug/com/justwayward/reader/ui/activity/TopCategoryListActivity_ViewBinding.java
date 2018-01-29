// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TopCategoryListActivity_ViewBinding<T extends TopCategoryListActivity> implements Unbinder {
  protected T target;

  @UiThread
  public TopCategoryListActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mRvMaleCategory = Utils.findRequiredViewAsType(source, R.id.rvMaleCategory, "field 'mRvMaleCategory'", RecyclerView.class);
    target.mRvFeMaleCategory = Utils.findRequiredViewAsType(source, R.id.rvFemaleCategory, "field 'mRvFeMaleCategory'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mRvMaleCategory = null;
    target.mRvFeMaleCategory = null;

    this.target = null;
  }
}
