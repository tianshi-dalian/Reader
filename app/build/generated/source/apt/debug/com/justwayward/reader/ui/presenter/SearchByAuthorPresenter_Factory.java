package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchByAuthorPresenter_Factory implements Factory<SearchByAuthorPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SearchByAuthorPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SearchByAuthorPresenter get() {
    return new SearchByAuthorPresenter(bookApiProvider.get());
  }

  public static Factory<SearchByAuthorPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SearchByAuthorPresenter_Factory(bookApiProvider);
  }
}
