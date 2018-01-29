package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailPresenter_Factory implements Factory<BookDetailPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookDetailPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookDetailPresenter get() {
    return new BookDetailPresenter(bookApiProvider.get());
  }

  public static Factory<BookDetailPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookDetailPresenter_Factory(bookApiProvider);
  }
}
