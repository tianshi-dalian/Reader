package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SearchByAuthorPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchByAuthorActivity_MembersInjector
    implements MembersInjector<SearchByAuthorActivity> {
  private final Provider<SearchByAuthorPresenter> mPresenterProvider;

  public SearchByAuthorActivity_MembersInjector(
      Provider<SearchByAuthorPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SearchByAuthorActivity> create(
      Provider<SearchByAuthorPresenter> mPresenterProvider) {
    return new SearchByAuthorActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SearchByAuthorActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      SearchByAuthorActivity instance, SearchByAuthorPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
