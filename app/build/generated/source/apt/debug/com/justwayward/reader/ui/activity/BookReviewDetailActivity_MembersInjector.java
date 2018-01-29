package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookReviewDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookReviewDetailActivity_MembersInjector
    implements MembersInjector<BookReviewDetailActivity> {
  private final Provider<BookReviewDetailPresenter> mPresenterProvider;

  public BookReviewDetailActivity_MembersInjector(
      Provider<BookReviewDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookReviewDetailActivity> create(
      Provider<BookReviewDetailPresenter> mPresenterProvider) {
    return new BookReviewDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookReviewDetailActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      BookReviewDetailActivity instance, BookReviewDetailPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
