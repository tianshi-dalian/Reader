package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.TopCategoryListPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopCategoryListActivity_MembersInjector
    implements MembersInjector<TopCategoryListActivity> {
  private final Provider<TopCategoryListPresenter> mPresenterProvider;

  public TopCategoryListActivity_MembersInjector(
      Provider<TopCategoryListPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<TopCategoryListActivity> create(
      Provider<TopCategoryListPresenter> mPresenterProvider) {
    return new TopCategoryListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(TopCategoryListActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      TopCategoryListActivity instance, TopCategoryListPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
