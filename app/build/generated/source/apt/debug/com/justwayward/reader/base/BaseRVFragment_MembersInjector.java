package com.justwayward.reader.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseRVFragment_MembersInjector<T1 extends BaseContract.BasePresenter, T2>
    implements MembersInjector<BaseRVFragment<T1, T2>> {
  private final Provider<T1> mPresenterProvider;

  public BaseRVFragment_MembersInjector(Provider<T1> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T1 extends BaseContract.BasePresenter, T2>
      MembersInjector<BaseRVFragment<T1, T2>> create(Provider<T1> mPresenterProvider) {
    return new BaseRVFragment_MembersInjector<T1, T2>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseRVFragment<T1, T2> instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static <T1 extends BaseContract.BasePresenter, T2> void injectMPresenter(
      BaseRVFragment<T1, T2> instance, T1 mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
