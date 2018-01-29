package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.MainActivityPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainActivityPresenter> mPresenterProvider;

  public MainActivity_MembersInjector(Provider<MainActivityPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainActivityPresenter> mPresenterProvider) {
    return new MainActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(MainActivity instance, MainActivityPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
