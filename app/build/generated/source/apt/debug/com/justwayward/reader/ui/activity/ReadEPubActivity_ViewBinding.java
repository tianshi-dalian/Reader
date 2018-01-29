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
import com.justwayward.reader.view.epubview.DirectionalViewpager;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadEPubActivity_ViewBinding<T extends ReadEPubActivity> implements Unbinder {
  protected T target;

  private View view2131296548;

  @UiThread
  public ReadEPubActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.viewpager = Utils.findRequiredViewAsType(source, R.id.epubViewPager, "field 'viewpager'", DirectionalViewpager.class);
    view = Utils.findRequiredView(source, R.id.toolbar_menu, "field 'ivMenu' and method 'showMenu'");
    target.ivMenu = view;
    view2131296548 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showMenu();
      }
    });
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.toolbar_title, "field 'tvTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.viewpager = null;
    target.ivMenu = null;
    target.tvTitle = null;

    view2131296548.setOnClickListener(null);
    view2131296548 = null;

    this.target = null;
  }
}
