package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.BookHelpPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookHelpFragment_MembersInjector implements MembersInjector<BookHelpFragment> {
  private final Provider<BookHelpPresenter> mPresenterProvider;

  public BookHelpFragment_MembersInjector(Provider<BookHelpPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookHelpFragment> create(
      Provider<BookHelpPresenter> mPresenterProvider) {
    return new BookHelpFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookHelpFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
