package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.BookReadPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReadActivity_MembersInjector implements MembersInjector<ReadActivity> {
  private final Provider<BookReadPresenter> mPresenterProvider;

  public ReadActivity_MembersInjector(Provider<BookReadPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ReadActivity> create(
      Provider<BookReadPresenter> mPresenterProvider) {
    return new ReadActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ReadActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(ReadActivity instance, BookReadPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
