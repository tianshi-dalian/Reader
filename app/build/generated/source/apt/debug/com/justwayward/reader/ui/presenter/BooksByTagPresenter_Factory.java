package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BooksByTagPresenter_Factory implements Factory<BooksByTagPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BooksByTagPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BooksByTagPresenter get() {
    return new BooksByTagPresenter(bookApiProvider.get());
  }

  public static Factory<BooksByTagPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BooksByTagPresenter_Factory(bookApiProvider);
  }
}
