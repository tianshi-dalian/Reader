package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.BookReviewPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookReviewFragment_MembersInjector
    implements MembersInjector<BookReviewFragment> {
  private final Provider<BookReviewPresenter> mPresenterProvider;

  public BookReviewFragment_MembersInjector(Provider<BookReviewPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookReviewFragment> create(
      Provider<BookReviewPresenter> mPresenterProvider) {
    return new BookReviewFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookReviewFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
