package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookReviewDetailPresenter_Factory implements Factory<BookReviewDetailPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookReviewDetailPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookReviewDetailPresenter get() {
    return new BookReviewDetailPresenter(bookApiProvider.get());
  }

  public static Factory<BookReviewDetailPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookReviewDetailPresenter_Factory(bookApiProvider);
  }
}
