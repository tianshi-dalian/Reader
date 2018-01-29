package com.justwayward.reader.ui.activity;

import com.justwayward.reader.ui.presenter.SubjectBookListDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectBookListDetailActivity_MembersInjector
    implements MembersInjector<SubjectBookListDetailActivity> {
  private final Provider<SubjectBookListDetailPresenter> mPresenterProvider;

  public SubjectBookListDetailActivity_MembersInjector(
      Provider<SubjectBookListDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubjectBookListDetailActivity> create(
      Provider<SubjectBookListDetailPresenter> mPresenterProvider) {
    return new SubjectBookListDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubjectBookListDetailActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      SubjectBookListDetailActivity instance, SubjectBookListDetailPresenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
