// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseCommuniteActivity_ViewBinding;
import com.justwayward.reader.view.SelectionLayout;
import java.lang.Override;

public class BookReviewActivity_ViewBinding<T extends BookReviewActivity> extends BaseCommuniteActivity_ViewBinding<T> {
  @UiThread
  public BookReviewActivity_ViewBinding(T target, View source) {
    super(target, source);

    target.slOverall = Utils.findRequiredViewAsType(source, R.id.slOverall, "field 'slOverall'", SelectionLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.slOverall = null;
  }
}
