package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookSourcePresenter_Factory implements Factory<BookSourcePresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookSourcePresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookSourcePresenter get() {
    return new BookSourcePresenter(bookApiProvider.get());
  }

  public static Factory<BookSourcePresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookSourcePresenter_Factory(bookApiProvider);
  }
}
