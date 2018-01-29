// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadCHMActivity_ViewBinding<T extends ReadCHMActivity> implements Unbinder {
  protected T target;

  @UiThread
  public ReadCHMActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'mProgressBar'", ProgressBar.class);
    target.mWebView = Utils.findRequiredViewAsType(source, R.id.webview, "field 'mWebView'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mProgressBar = null;
    target.mWebView = null;

    this.target = null;
  }
}
