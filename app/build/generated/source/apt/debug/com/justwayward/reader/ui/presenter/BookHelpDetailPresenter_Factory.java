package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookHelpDetailPresenter_Factory implements Factory<BookHelpDetailPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookHelpDetailPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookHelpDetailPresenter get() {
    return new BookHelpDetailPresenter(bookApiProvider.get());
  }

  public static Factory<BookHelpDetailPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookHelpDetailPresenter_Factory(bookApiProvider);
  }
}
