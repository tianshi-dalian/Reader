package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.GirlBookDiscussionPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GirlBookDiscussionFragment_MembersInjector
    implements MembersInjector<GirlBookDiscussionFragment> {
  private final Provider<GirlBookDiscussionPresenter> mPresenterProvider;

  public GirlBookDiscussionFragment_MembersInjector(
      Provider<GirlBookDiscussionPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<GirlBookDiscussionFragment> create(
      Provider<GirlBookDiscussionPresenter> mPresenterProvider) {
    return new GirlBookDiscussionFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(GirlBookDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
