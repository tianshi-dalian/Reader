// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ExpandableListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TopRankActivity_ViewBinding<T extends TopRankActivity> implements Unbinder {
  protected T target;

  @UiThread
  public TopRankActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.elvFeMale = Utils.findRequiredViewAsType(source, R.id.elvFeMale, "field 'elvFeMale'", ExpandableListView.class);
    target.elvMale = Utils.findRequiredViewAsType(source, R.id.elvMale, "field 'elvMale'", ExpandableListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.elvFeMale = null;
    target.elvMale = null;

    this.target = null;
  }
}
