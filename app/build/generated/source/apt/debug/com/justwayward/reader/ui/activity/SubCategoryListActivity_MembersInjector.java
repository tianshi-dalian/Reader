package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SubCategoryActivityPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubCategoryListActivity_MembersInjector
    implements MembersInjector<SubCategoryListActivity> {
  private final Provider<SubCategoryActivityPresenter> mPresenterProvider;

  public SubCategoryListActivity_MembersInjector(
      Provider<SubCategoryActivityPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubCategoryListActivity> create(
      Provider<SubCategoryActivityPresenter> mPresenterProvider) {
    return new SubCategoryListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubCategoryListActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      SubCategoryListActivity instance, SubCategoryActivityPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
