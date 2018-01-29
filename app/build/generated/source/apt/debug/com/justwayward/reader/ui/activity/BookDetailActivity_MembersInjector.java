package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailActivity_MembersInjector
    implements MembersInjector<BookDetailActivity> {
  private final Provider<BookDetailPresenter> mPresenterProvider;

  public BookDetailActivity_MembersInjector(Provider<BookDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookDetailActivity> create(
      Provider<BookDetailPresenter> mPresenterProvider) {
    return new BookDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookDetailActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(BookDetailActivity instance, BookDetailPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
