// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.fragment;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseRVFragment_ViewBinding;
import java.lang.Override;

public class RecommendFragment_ViewBinding<T extends RecommendFragment> extends BaseRVFragment_ViewBinding<T> {
  private View view2131296629;

  private View view2131296592;

  @UiThread
  public RecommendFragment_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    target.llBatchManagement = Utils.findRequiredViewAsType(source, R.id.llBatchManagement, "field 'llBatchManagement'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.tvSelectAll, "field 'tvSelectAll' and method 'selectAll'");
    target.tvSelectAll = Utils.castView(view, R.id.tvSelectAll, "field 'tvSelectAll'", TextView.class);
    view2131296629 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selectAll();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvDelete, "field 'tvDelete' and method 'delete'");
    target.tvDelete = Utils.castView(view, R.id.tvDelete, "field 'tvDelete'", TextView.class);
    view2131296592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.delete();
      }
    });
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.llBatchManagement = null;
    target.tvSelectAll = null;
    target.tvDelete = null;

    view2131296629.setOnClickListener(null);
    view2131296629 = null;
    view2131296592.setOnClickListener(null);
    view2131296592 = null;
  }
}
