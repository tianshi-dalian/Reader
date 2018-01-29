package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.SubCategoryFragmentPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubCategoryFragment_MembersInjector
    implements MembersInjector<SubCategoryFragment> {
  private final Provider<SubCategoryFragmentPresenter> mPresenterProvider;

  public SubCategoryFragment_MembersInjector(
      Provider<SubCategoryFragmentPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubCategoryFragment> create(
      Provider<SubCategoryFragmentPresenter> mPresenterProvider) {
    return new SubCategoryFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubCategoryFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
