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
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import com.justwayward.reader.view.DrawableCenterButton;
import com.justwayward.reader.view.TagGroup;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookDetailActivity_ViewBinding<T extends BookDetailActivity> implements Unbinder {
  protected T target;

  private View view2131296566;

  private View view2131296306;

  private View view2131296305;

  private View view2131296651;

  private View view2131296612;

  private View view2131296476;

  @UiThread
  public BookDetailActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mIvBookCover = Utils.findRequiredViewAsType(source, R.id.ivBookCover, "field 'mIvBookCover'", ImageView.class);
    target.mTvBookTitle = Utils.findRequiredViewAsType(source, R.id.tvBookListTitle, "field 'mTvBookTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tvBookListAuthor, "field 'mTvAuthor' and method 'searchByAuthor'");
    target.mTvAuthor = Utils.castView(view, R.id.tvBookListAuthor, "field 'mTvAuthor'", TextView.class);
    view2131296566 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.searchByAuthor();
      }
    });
    target.mTvCatgory = Utils.findRequiredViewAsType(source, R.id.tvCatgory, "field 'mTvCatgory'", TextView.class);
    target.mTvWordCount = Utils.findRequiredViewAsType(source, R.id.tvWordCount, "field 'mTvWordCount'", TextView.class);
    target.mTvLatelyUpdate = Utils.findRequiredViewAsType(source, R.id.tvLatelyUpdate, "field 'mTvLatelyUpdate'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnRead, "field 'mBtnRead' and method 'onClickRead'");
    target.mBtnRead = Utils.castView(view, R.id.btnRead, "field 'mBtnRead'", DrawableCenterButton.class);
    view2131296306 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickRead();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnJoinCollection, "field 'mBtnJoinCollection' and method 'onClickJoinCollection'");
    target.mBtnJoinCollection = Utils.castView(view, R.id.btnJoinCollection, "field 'mBtnJoinCollection'", DrawableCenterButton.class);
    view2131296305 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickJoinCollection();
      }
    });
    target.mTvLatelyFollower = Utils.findRequiredViewAsType(source, R.id.tvLatelyFollower, "field 'mTvLatelyFollower'", TextView.class);
    target.mTvRetentionRatio = Utils.findRequiredViewAsType(source, R.id.tvRetentionRatio, "field 'mTvRetentionRatio'", TextView.class);
    target.mTvSerializeWordCount = Utils.findRequiredViewAsType(source, R.id.tvSerializeWordCount, "field 'mTvSerializeWordCount'", TextView.class);
    target.mTagGroup = Utils.findRequiredViewAsType(source, R.id.tag_group, "field 'mTagGroup'", TagGroup.class);
    view = Utils.findRequiredView(source, R.id.tvlongIntro, "field 'mTvlongIntro' and method 'collapseLongIntro'");
    target.mTvlongIntro = Utils.castView(view, R.id.tvlongIntro, "field 'mTvlongIntro'", TextView.class);
    view2131296651 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.collapseLongIntro();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvMoreReview, "field 'mTvMoreReview' and method 'onClickMoreReview'");
    target.mTvMoreReview = Utils.castView(view, R.id.tvMoreReview, "field 'mTvMoreReview'", TextView.class);
    view2131296612 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickMoreReview();
      }
    });
    target.mRvHotReview = Utils.findRequiredViewAsType(source, R.id.rvHotReview, "field 'mRvHotReview'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.rlCommunity, "field 'mRlCommunity' and method 'onClickCommunity'");
    target.mRlCommunity = Utils.castView(view, R.id.rlCommunity, "field 'mRlCommunity'", RelativeLayout.class);
    view2131296476 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCommunity();
      }
    });
    target.mTvCommunity = Utils.findRequiredViewAsType(source, R.id.tvCommunity, "field 'mTvCommunity'", TextView.class);
    target.mTvPostCount = Utils.findRequiredViewAsType(source, R.id.tvHelpfulYes, "field 'mTvPostCount'", TextView.class);
    target.mTvRecommendBookList = Utils.findRequiredViewAsType(source, R.id.tvRecommendBookList, "field 'mTvRecommendBookList'", TextView.class);
    target.mRvRecommendBoookList = Utils.findRequiredViewAsType(source, R.id.rvRecommendBoookList, "field 'mRvRecommendBoookList'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mIvBookCover = null;
    target.mTvBookTitle = null;
    target.mTvAuthor = null;
    target.mTvCatgory = null;
    target.mTvWordCount = null;
    target.mTvLatelyUpdate = null;
    target.mBtnRead = null;
    target.mBtnJoinCollection = null;
    target.mTvLatelyFollower = null;
    target.mTvRetentionRatio = null;
    target.mTvSerializeWordCount = null;
    target.mTagGroup = null;
    target.mTvlongIntro = null;
    target.mTvMoreReview = null;
    target.mRvHotReview = null;
    target.mRlCommunity = null;
    target.mTvCommunity = null;
    target.mTvPostCount = null;
    target.mTvRecommendBookList = null;
    target.mRvRecommendBoookList = null;

    view2131296566.setOnClickListener(null);
    view2131296566 = null;
    view2131296306.setOnClickListener(null);
    view2131296306 = null;
    view2131296305.setOnClickListener(null);
    view2131296305 = null;
    view2131296651.setOnClickListener(null);
    view2131296651 = null;
    view2131296612.setOnClickListener(null);
    view2131296612 = null;
    view2131296476.setOnClickListener(null);
    view2131296476 = null;

    this.target = null;
  }
}
