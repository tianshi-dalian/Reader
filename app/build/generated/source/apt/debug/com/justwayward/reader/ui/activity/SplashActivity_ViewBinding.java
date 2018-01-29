// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SplashActivity_ViewBinding<T extends SplashActivity> implements Unbinder {
  protected T target;

  @UiThread
  public SplashActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.tvSkip = Utils.findRequiredViewAsType(source, R.id.tvSkip, "field 'tvSkip'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvSkip = null;

    this.target = null;
  }
}
