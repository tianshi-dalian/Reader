// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.ProgressWebView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedbackActivity_ViewBinding<T extends FeedbackActivity> implements Unbinder {
  protected T target;

  @UiThread
  public FeedbackActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.feedbackView = Utils.findRequiredViewAsType(source, R.id.feedbackView, "field 'feedbackView'", ProgressWebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.feedbackView = null;

    this.target = null;
  }
}
