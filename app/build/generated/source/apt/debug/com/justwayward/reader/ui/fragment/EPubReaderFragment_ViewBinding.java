// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.epubview.ObservableWebView;
import com.justwayward.reader.view.epubview.VerticalSeekbar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EPubReaderFragment_ViewBinding<T extends EPubReaderFragment> implements Unbinder {
  protected T target;

  @UiThread
  public EPubReaderFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mScrollSeekbar = Utils.findRequiredViewAsType(source, R.id.scrollSeekbar, "field 'mScrollSeekbar'", VerticalSeekbar.class);
    target.mWebview = Utils.findRequiredViewAsType(source, R.id.contentWebView, "field 'mWebview'", ObservableWebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mScrollSeekbar = null;
    target.mWebview = null;

    this.target = null;
  }
}
