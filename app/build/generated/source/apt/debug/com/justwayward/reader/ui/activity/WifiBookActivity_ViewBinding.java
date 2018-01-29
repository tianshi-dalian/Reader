// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WifiBookActivity_ViewBinding<T extends WifiBookActivity> implements Unbinder {
  protected T target;

  private View view2131296622;

  @UiThread
  public WifiBookActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mTvWifiName = Utils.findRequiredViewAsType(source, R.id.mTvWifiName, "field 'mTvWifiName'", TextView.class);
    target.mTvWifiIp = Utils.findRequiredViewAsType(source, R.id.mTvWifiIp, "field 'mTvWifiIp'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tvRetry, "field 'tvRetry' and method 'retry'");
    target.tvRetry = Utils.castView(view, R.id.tvRetry, "field 'tvRetry'", TextView.class);
    view2131296622 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.retry();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTvWifiName = null;
    target.mTvWifiIp = null;
    target.tvRetry = null;

    view2131296622.setOnClickListener(null);
    view2131296622 = null;

    this.target = null;
  }
}
