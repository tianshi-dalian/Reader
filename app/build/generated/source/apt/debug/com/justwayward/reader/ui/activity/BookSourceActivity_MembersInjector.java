package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookSourcePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookSourceActivity_MembersInjector
    implements MembersInjector<BookSourceActivity> {
  private final Provider<BookSourcePresenter> mPresenterProvider;

  public BookSourceActivity_MembersInjector(Provider<BookSourcePresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookSourceActivity> create(
      Provider<BookSourcePresenter> mPresenterProvider) {
    return new BookSourceActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookSourceActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(BookSourceActivity instance, BookSourcePresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
