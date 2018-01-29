package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookDiscussionDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDiscussionDetailActivity_MembersInjector
    implements MembersInjector<BookDiscussionDetailActivity> {
  private final Provider<BookDiscussionDetailPresenter> mPresenterProvider;

  public BookDiscussionDetailActivity_MembersInjector(
      Provider<BookDiscussionDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookDiscussionDetailActivity> create(
      Provider<BookDiscussionDetailPresenter> mPresenterProvider) {
    return new BookDiscussionDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookDiscussionDetailActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      BookDiscussionDetailActivity instance, BookDiscussionDetailPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
