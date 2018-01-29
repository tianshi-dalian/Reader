package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.RecommendPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecommendFragment_MembersInjector implements MembersInjector<RecommendFragment> {
  private final Provider<RecommendPresenter> mPresenterProvider;

  public RecommendFragment_MembersInjector(Provider<RecommendPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RecommendFragment> create(
      Provider<RecommendPresenter> mPresenterProvider) {
    return new RecommendFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RecommendFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
