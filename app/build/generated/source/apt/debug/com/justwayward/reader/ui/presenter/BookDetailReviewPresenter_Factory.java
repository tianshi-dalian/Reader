package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailReviewPresenter_Factory implements Factory<BookDetailReviewPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookDetailReviewPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookDetailReviewPresenter get() {
    return new BookDetailReviewPresenter(bookApiProvider.get());
  }

  public static Factory<BookDetailReviewPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookDetailReviewPresenter_Factory(bookApiProvider);
  }
}
