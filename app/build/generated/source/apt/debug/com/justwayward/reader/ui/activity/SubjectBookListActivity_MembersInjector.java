package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SubjectBookListPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectBookListActivity_MembersInjector
    implements MembersInjector<SubjectBookListActivity> {
  private final Provider<SubjectBookListPresenter> mPresenterProvider;

  public SubjectBookListActivity_MembersInjector(
      Provider<SubjectBookListPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubjectBookListActivity> create(
      Provider<SubjectBookListPresenter> mPresenterProvider) {
    return new SubjectBookListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubjectBookListActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      SubjectBookListActivity instance, SubjectBookListPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
