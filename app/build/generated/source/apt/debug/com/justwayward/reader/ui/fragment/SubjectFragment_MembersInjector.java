package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.SubjectFragmentPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectFragment_MembersInjector implements MembersInjector<SubjectFragment> {
  private final Provider<SubjectFragmentPresenter> mPresenterProvider;

  public SubjectFragment_MembersInjector(Provider<SubjectFragmentPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubjectFragment> create(
      Provider<SubjectFragmentPresenter> mPresenterProvider) {
    return new SubjectFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubjectFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
