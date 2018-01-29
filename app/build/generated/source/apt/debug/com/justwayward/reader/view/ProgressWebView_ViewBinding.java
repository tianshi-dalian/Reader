// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.view;

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

public class ProgressWebView_ViewBinding<T extends ProgressWebView> implements Unbinder {
  protected T target;

  @UiThread
  public ProgressWebView_ViewBinding(T target, View source) {
    this.target = target;

    target.mWebView = Utils.findRequiredViewAsType(source, R.id.web_view, "field 'mWebView'", WebView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'mProgressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mWebView = null;
    target.mProgressBar = null;

    this.target = null;
  }
}
