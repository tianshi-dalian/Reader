package com.justwayward.reader.component;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.activity.BookDetailActivity;
import com.justwayward.reader.ui.activity.BookDetailActivity_MembersInjector;
import com.justwayward.reader.ui.activity.BookSourceActivity;
import com.justwayward.reader.ui.activity.BookSourceActivity_MembersInjector;
import com.justwayward.reader.ui.activity.BooksByTagActivity;
import com.justwayward.reader.ui.activity.BooksByTagActivity_MembersInjector;
import com.justwayward.reader.ui.activity.ReadActivity;
import com.justwayward.reader.ui.activity.ReadActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SearchActivity;
import com.justwayward.reader.ui.activity.SearchActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SearchByAuthorActivity;
import com.justwayward.reader.ui.activity.SearchByAuthorActivity_MembersInjector;
import com.justwayward.reader.ui.fragment.BookDetailDiscussionFragment;
import com.justwayward.reader.ui.fragment.BookDetailReviewFragment;
import com.justwayward.reader.ui.presenter.BookDetailDiscussionPresenter;
import com.justwayward.reader.ui.presenter.BookDetailPresenter;
import com.justwayward.reader.ui.presenter.BookDetailReviewPresenter;
import com.justwayward.reader.ui.presenter.BookReadPresenter;
import com.justwayward.reader.ui.presenter.BookSourcePresenter;
import com.justwayward.reader.ui.presenter.BooksByTagPresenter;
import com.justwayward.reader.ui.presenter.SearchByAuthorPresenter;
import com.justwayward.reader.ui.presenter.SearchPresenter;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBookComponent implements BookComponent {
  private AppComponent appComponent;

  private DaggerBookComponent(Builder builder) {
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
  public BookDetailActivity inject(BookDetailActivity activity) {
    return injectBookDetailActivity(activity);
  }

  @Override
  public ReadActivity inject(ReadActivity activity) {
    return injectReadActivity(activity);
  }

  @Override
  public BookSourceActivity inject(BookSourceActivity activity) {
    return injectBookSourceActivity(activity);
  }

  @Override
  public BooksByTagActivity inject(BooksByTagActivity activity) {
    return injectBooksByTagActivity(activity);
  }

  @Override
  public SearchActivity inject(SearchActivity activity) {
    return injectSearchActivity(activity);
  }

  @Override
  public SearchByAuthorActivity inject(SearchByAuthorActivity activity) {
    return injectSearchByAuthorActivity(activity);
  }

  @Override
  public BookDetailReviewFragment inject(BookDetailReviewFragment fragment) {
    return injectBookDetailReviewFragment(fragment);
  }

  @Override
  public BookDetailDiscussionFragment inject(BookDetailDiscussionFragment fragment) {
    return injectBookDetailDiscussionFragment(fragment);
  }

  private BookDetailActivity injectBookDetailActivity(BookDetailActivity instance) {
    BookDetailActivity_MembersInjector.injectMPresenter(
        instance,
        new BookDetailPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private ReadActivity injectReadActivity(ReadActivity instance) {
    ReadActivity_MembersInjector.injectMPresenter(
        instance,
        new BookReadPresenter(
            Preconditions.checkNotNull(
                appComponent.getContext(),
                "Cannot return null from a non-@Nullable component method"),
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookSourceActivity injectBookSourceActivity(BookSourceActivity instance) {
    BookSourceActivity_MembersInjector.injectMPresenter(
        instance,
        new BookSourcePresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BooksByTagActivity injectBooksByTagActivity(BooksByTagActivity instance) {
    BooksByTagActivity_MembersInjector.injectMPresenter(
        instance,
        new BooksByTagPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SearchActivity injectSearchActivity(SearchActivity instance) {
    SearchActivity_MembersInjector.injectMPresenter(
        instance,
        new SearchPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SearchByAuthorActivity injectSearchByAuthorActivity(SearchByAuthorActivity instance) {
    SearchByAuthorActivity_MembersInjector.injectMPresenter(
        instance,
        new SearchByAuthorPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookDetailReviewFragment injectBookDetailReviewFragment(
      BookDetailReviewFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new BookDetailReviewPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private BookDetailDiscussionFragment injectBookDetailDiscussionFragment(
      BookDetailDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new BookDetailDiscussionPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public BookComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerBookComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
