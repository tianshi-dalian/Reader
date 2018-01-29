package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookReviewPresenter_Factory implements Factory<BookReviewPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookReviewPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookReviewPresenter get() {
    return new BookReviewPresenter(bookApiProvider.get());
  }

  public static Factory<BookReviewPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookReviewPresenter_Factory(bookApiProvider);
  }
}
