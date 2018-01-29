package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookHelpPresenter_Factory implements Factory<BookHelpPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookHelpPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookHelpPresenter get() {
    return new BookHelpPresenter(bookApiProvider.get());
  }

  public static Factory<BookHelpPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookHelpPresenter_Factory(bookApiProvider);
  }
}
