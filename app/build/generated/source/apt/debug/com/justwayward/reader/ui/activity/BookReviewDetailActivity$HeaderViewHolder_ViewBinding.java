// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.BookContentTextView;
import com.justwayward.reader.view.XLHRatingBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookReviewDetailActivity$HeaderViewHolder_ViewBinding<T extends BookReviewDetailActivity.HeaderViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public BookReviewDetailActivity$HeaderViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivAuthorAvatar = Utils.findRequiredViewAsType(source, R.id.ivAuthorAvatar, "field 'ivAuthorAvatar'", ImageView.class);
    target.tvBookAuthor = Utils.findRequiredViewAsType(source, R.id.tvBookAuthor, "field 'tvBookAuthor'", TextView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tvTime, "field 'tvTime'", TextView.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tvTitle, "field 'tvTitle'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tvContent, "field 'tvContent'", BookContentTextView.class);
    target.rlBookInfo = Utils.findRequiredViewAsType(source, R.id.rlBookInfo, "field 'rlBookInfo'", RelativeLayout.class);
    target.ivBookCover = Utils.findRequiredViewAsType(source, R.id.ivBookCover, "field 'ivBookCover'", ImageView.class);
    target.tvBookTitle = Utils.findRequiredViewAsType(source, R.id.tvBookTitle, "field 'tvBookTitle'", TextView.class);
    target.tvHelpfullYesCount = Utils.findRequiredViewAsType(source, R.id.tvHelpfullYesCount, "field 'tvHelpfullYesCount'", TextView.class);
    target.tvHelpfullNoCount = Utils.findRequiredViewAsType(source, R.id.tvHelpfullNoCount, "field 'tvHelpfullNoCount'", TextView.class);
    target.tvBestComments = Utils.findRequiredViewAsType(source, R.id.tvBestComments, "field 'tvBestComments'", TextView.class);
    target.rvBestComments = Utils.findRequiredViewAsType(source, R.id.rvBestComments, "field 'rvBestComments'", RecyclerView.class);
    target.tvCommentCount = Utils.findRequiredViewAsType(source, R.id.tvCommentCount, "field 'tvCommentCount'", TextView.class);
    target.ratingBar = Utils.findRequiredViewAsType(source, R.id.rating, "field 'ratingBar'", XLHRatingBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivAuthorAvatar = null;
    target.tvBookAuthor = null;
    target.tvTime = null;
    target.tvTitle = null;
    target.tvContent = null;
    target.rlBookInfo = null;
    target.ivBookCover = null;
    target.tvBookTitle = null;
    target.tvHelpfullYesCount = null;
    target.tvHelpfullNoCount = null;
    target.tvBestComments = null;
    target.rvBestComments = null;
    target.tvCommentCount = null;
    target.ratingBar = null;

    this.target = null;
  }
}
