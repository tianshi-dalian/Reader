package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SubRankPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubOtherHomeRankActivity_MembersInjector
    implements MembersInjector<SubOtherHomeRankActivity> {
  private final Provider<SubRankPresenter> mPresenterProvider;

  public SubOtherHomeRankActivity_MembersInjector(Provider<SubRankPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubOtherHomeRankActivity> create(
      Provider<SubRankPresenter> mPresenterProvider) {
    return new SubOtherHomeRankActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubOtherHomeRankActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      SubOtherHomeRankActivity instance, SubRankPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
