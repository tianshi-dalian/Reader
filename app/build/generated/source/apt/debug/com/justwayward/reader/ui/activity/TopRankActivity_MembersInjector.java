package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.TopRankPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopRankActivity_MembersInjector implements MembersInjector<TopRankActivity> {
  private final Provider<TopRankPresenter> mPresenterProvider;

  public TopRankActivity_MembersInjector(Provider<TopRankPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<TopRankActivity> create(
      Provider<TopRankPresenter> mPresenterProvider) {
    return new TopRankActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(TopRankActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(TopRankActivity instance, TopRankPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
