package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookHelpDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookHelpDetailActivity_MembersInjector
    implements MembersInjector<BookHelpDetailActivity> {
  private final Provider<BookHelpDetailPresenter> mPresenterProvider;

  public BookHelpDetailActivity_MembersInjector(
      Provider<BookHelpDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookHelpDetailActivity> create(
      Provider<BookHelpDetailPresenter> mPresenterProvider) {
    return new BookHelpDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookHelpDetailActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      BookHelpDetailActivity instance, BookHelpDetailPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
