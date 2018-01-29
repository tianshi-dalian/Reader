// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.SelectionLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseCommuniteActivity_ViewBinding<T extends BaseCommuniteActivity> implements Unbinder {
  protected T target;

  @UiThread
  public BaseCommuniteActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.slOverall = Utils.findRequiredViewAsType(source, R.id.slOverall, "field 'slOverall'", SelectionLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.slOverall = null;

    this.target = null;
  }
}
