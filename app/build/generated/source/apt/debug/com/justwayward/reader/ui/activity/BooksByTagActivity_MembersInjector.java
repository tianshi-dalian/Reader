package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BooksByTagPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BooksByTagActivity_MembersInjector
    implements MembersInjector<BooksByTagActivity> {
  private final Provider<BooksByTagPresenter> mPresenterProvider;

  public BooksByTagActivity_MembersInjector(Provider<BooksByTagPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BooksByTagActivity> create(
      Provider<BooksByTagPresenter> mPresenterProvider) {
    return new BooksByTagActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BooksByTagActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(BooksByTagActivity instance, BooksByTagPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
