// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadPDFActivity_ViewBinding<T extends ReadPDFActivity> implements Unbinder {
  protected T target;

  @UiThread
  public ReadPDFActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.llPdfRoot = Utils.findRequiredViewAsType(source, R.id.llPdfRoot, "field 'llPdfRoot'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.llPdfRoot = null;

    this.target = null;
  }
}
