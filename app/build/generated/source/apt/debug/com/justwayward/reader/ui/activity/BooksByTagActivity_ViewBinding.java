// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BooksByTagActivity_ViewBinding<T extends BooksByTagActivity> implements Unbinder {
  protected T target;

  @UiThread
  public BooksByTagActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerview, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.refreshLayout = null;
    target.mRecyclerView = null;

    this.target = null;
  }
}
