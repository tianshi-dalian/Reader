// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubjectBookListDetailActivity$HeaderViewHolder_ViewBinding<T extends SubjectBookListDetailActivity.HeaderViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public SubjectBookListDetailActivity$HeaderViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.tvBookListTitle = Utils.findRequiredViewAsType(source, R.id.tvBookListTitle, "field 'tvBookListTitle'", TextView.class);
    target.tvBookListDesc = Utils.findRequiredViewAsType(source, R.id.tvBookListDesc, "field 'tvBookListDesc'", TextView.class);
    target.ivAuthorAvatar = Utils.findRequiredViewAsType(source, R.id.ivAuthorAvatar, "field 'ivAuthorAvatar'", ImageView.class);
    target.tvBookListAuthor = Utils.findRequiredViewAsType(source, R.id.tvBookListAuthor, "field 'tvBookListAuthor'", TextView.class);
    target.btnShare = Utils.findRequiredViewAsType(source, R.id.btnShare, "field 'btnShare'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvBookListTitle = null;
    target.tvBookListDesc = null;
    target.ivAuthorAvatar = null;
    target.tvBookListAuthor = null;
    target.btnShare = null;

    this.target = null;
  }
}
