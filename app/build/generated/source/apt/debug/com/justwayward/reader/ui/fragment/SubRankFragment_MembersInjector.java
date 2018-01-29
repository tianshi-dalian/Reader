package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.SubRankPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubRankFragment_MembersInjector implements MembersInjector<SubRankFragment> {
  private final Provider<SubRankPresenter> mPresenterProvider;

  public SubRankFragment_MembersInjector(Provider<SubRankPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubRankFragment> create(
      Provider<SubRankPresenter> mPresenterProvider) {
    return new SubRankFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubRankFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
