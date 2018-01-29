package com.justwayward.reader.ui.presenter;

import android.content.Context;
import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookReadPresenter_Factory implements Factory<BookReadPresenter> {
  private final Provider<Context> mContextProvider;

  private final Provider<BookApi> bookApiProvider;

  public BookReadPresenter_Factory(
      Provider<Context> mContextProvider, Provider<BookApi> bookApiProvider) {
    this.mContextProvider = mContextProvider;
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookReadPresenter get() {
    return new BookReadPresenter(mContextProvider.get(), bookApiProvider.get());
  }

  public static Factory<BookReadPresenter> create(
      Provider<Context> mContextProvider, Provider<BookApi> bookApiProvider) {
    return new BookReadPresenter_Factory(mContextProvider, bookApiProvider);
  }
}
