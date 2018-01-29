package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.BookDetailDiscussionPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailDiscussionFragment_MembersInjector
    implements MembersInjector<BookDetailDiscussionFragment> {
  private final Provider<BookDetailDiscussionPresenter> mPresenterProvider;

  public BookDetailDiscussionFragment_MembersInjector(
      Provider<BookDetailDiscussionPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookDetailDiscussionFragment> create(
      Provider<BookDetailDiscussionPresenter> mPresenterProvider) {
    return new BookDetailDiscussionFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookDetailDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
