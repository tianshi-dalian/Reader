package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SearchPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<SearchPresenter> mPresenterProvider;

  public SearchActivity_MembersInjector(Provider<SearchPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SearchActivity> create(
      Provider<SearchPresenter> mPresenterProvider) {
    return new SearchActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(SearchActivity instance, SearchPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
