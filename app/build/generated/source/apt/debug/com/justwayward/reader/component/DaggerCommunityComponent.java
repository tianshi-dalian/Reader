package com.justwayward.reader.component;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.activity.BookDiscussionDetailActivity;
import com.justwayward.reader.ui.activity.BookDiscussionDetailActivity_MembersInjector;
import com.justwayward.reader.ui.activity.BookHelpDetailActivity;
import com.justwayward.reader.ui.activity.BookHelpDetailActivity_MembersInjector;
import com.justwayward.reader.ui.activity.BookReviewDetailActivity;
import com.justwayward.reader.ui.activity.BookReviewDetailActivity_MembersInjector;
import com.justwayward.reader.ui.fragment.BookDiscussionFragment;
import com.justwayward.reader.ui.fragment.BookHelpFragment;
import com.justwayward.reader.ui.fragment.BookReviewFragment;
import com.justwayward.reader.ui.fragment.GirlBookDiscussionFragment;
import com.justwayward.reader.ui.presenter.BookDiscussionDetailPresenter;
import com.justwayward.reader.ui.presenter.BookDiscussionPresenter;
import com.justwayward.reader.ui.presenter.BookHelpDetailPresenter;
import com.justwayward.reader.ui.presenter.BookHelpPresenter;
import com.justwayward.reader.ui.presenter.BookReviewDetailPresenter;
import com.justwayward.reader.ui.presenter.BookReviewPresenter;
import com.justwayward.reader.ui.presenter.GirlBookDiscussionPresenter;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCommunityComponent implements CommunityComponent {
  private AppComponent appComponent;

  private DaggerCommunityComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appComponent = builder.appComponent;
  }

  @Override
  public BookDiscussionFragment inject(BookDiscussionFragment fragment) {
    return injectBookDiscussionFragment(fragment);
  }

  @Override
  public BookDiscussionDetailActivity inject(BookDiscussionDetailActivity activity) {
    return injectBookDiscussionDetailActivity(activity);
  }

  @Override
  public BookReviewFragment inject(BookReviewFragment fragment) {
    return injectBookReviewFragment(fragment);
  }

  @Override
  public BookReviewDetailActivity inject(BookReviewDetailActivity activity) {
    return injectBookReviewDetailActivity(activity);
  }

  @Override
  public BookHelpFragment inject(BookHelpFragment fragment) {
    return injectBookHelpFragment(fragment);
  }

  @Override
  public BookHelpDetailActivity inject(BookHelpDetailActivity activity) {
    return injectBookHelpDetailActivity(activity);
  }

  @Override
  public GirlBookDiscussionFragment inject(GirlBookDiscussionFragment fragment) {
    return injectGirlBookDiscussionFragment(fragment);
  }

  private BookDiscussionFragment injectBookDiscussionFragment(BookDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new BookDiscussionPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookDiscussionDetailActivity injectBookDiscussionDetailActivity(
      BookDiscussionDetailActivity instance) {
    BookDiscussionDetailActivity_MembersInjector.injectMPresenter(
        instance,
        new BookDiscussionDetailPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookReviewFragment injectBookReviewFragment(BookReviewFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new BookReviewPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookReviewDetailActivity injectBookReviewDetailActivity(
      BookReviewDetailActivity instance) {
    BookReviewDetailActivity_MembersInjector.injectMPresenter(
        instance,
        new BookReviewDetailPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookHelpFragment injectBookHelpFragment(BookHelpFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new BookHelpPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookHelpDetailActivity injectBookHelpDetailActivity(BookHelpDetailActivity instance) {
    BookHelpDetailActivity_MembersInjector.injectMPresenter(
        instance,
        new BookHelpDetailPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private GirlBookDiscussionFragment injectGirlBookDiscussionFragment(
      GirlBookDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new GirlBookDiscussionPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public CommunityComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerCommunityComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
