package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchPresenter_Factory implements Factory<SearchPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SearchPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SearchPresenter get() {
    return new SearchPresenter(bookApiProvider.get());
  }

  public static Factory<SearchPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SearchPresenter_Factory(bookApiProvider);
  }
}
