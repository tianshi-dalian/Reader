package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.BookDiscussionPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDiscussionFragment_MembersInjector
    implements MembersInjector<BookDiscussionFragment> {
  private final Provider<BookDiscussionPresenter> mPresenterProvider;

  public BookDiscussionFragment_MembersInjector(
      Provider<BookDiscussionPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookDiscussionFragment> create(
      Provider<BookDiscussionPresenter> mPresenterProvider) {
    return new BookDiscussionFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookDiscussionFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
