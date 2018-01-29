package com.justwayward.reader.ui.fragment;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.presenter.BookDetailReviewPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailReviewFragment_MembersInjector
    implements MembersInjector<BookDetailReviewFragment> {
  private final Provider<BookDetailReviewPresenter> mPresenterProvider;

  public BookDetailReviewFragment_MembersInjector(
      Provider<BookDetailReviewPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BookDetailReviewFragment> create(
      Provider<BookDetailReviewPresenter> mPresenterProvider) {
    return new BookDetailReviewFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BookDetailReviewFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
