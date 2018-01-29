package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityPresenter_Factory implements Factory<MainActivityPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public MainActivityPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public MainActivityPresenter get() {
    return new MainActivityPresenter(bookApiProvider.get());
  }

  public static Factory<MainActivityPresenter> create(Provider<BookApi> bookApiProvider) {
    return new MainActivityPresenter_Factory(bookApiProvider);
  }
}
