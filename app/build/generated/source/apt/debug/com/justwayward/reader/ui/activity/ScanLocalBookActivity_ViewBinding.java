// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.recyclerview.EasyRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScanLocalBookActivity_ViewBinding<T extends ScanLocalBookActivity> implements Unbinder {
  protected T target;

  @UiThread
  public ScanLocalBookActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerview, "field 'mRecyclerView'", EasyRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mRecyclerView = null;

    this.target = null;
  }
}
