// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.BookContentTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookDiscussionDetailActivity$HeaderViewHolder_ViewBinding<T extends BookDiscussionDetailActivity.HeaderViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public BookDiscussionDetailActivity$HeaderViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.ivBookCover, "field 'ivAvatar'", ImageView.class);
    target.tvNickName = Utils.findRequiredViewAsType(source, R.id.tvBookTitle, "field 'tvNickName'", TextView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tvTime, "field 'tvTime'", TextView.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tvTitle, "field 'tvTitle'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tvContent, "field 'tvContent'", BookContentTextView.class);
    target.tvBestComments = Utils.findRequiredViewAsType(source, R.id.tvBestComments, "field 'tvBestComments'", TextView.class);
    target.rvBestComments = Utils.findRequiredViewAsType(source, R.id.rvBestComments, "field 'rvBestComments'", RecyclerView.class);
    target.tvCommentCount = Utils.findRequiredViewAsType(source, R.id.tvCommentCount, "field 'tvCommentCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivAvatar = null;
    target.tvNickName = null;
    target.tvTime = null;
    target.tvTitle = null;
    target.tvContent = null;
    target.tvBestComments = null;
    target.rvBestComments = null;
    target.tvCommentCount = null;

    this.target = null;
  }
}
