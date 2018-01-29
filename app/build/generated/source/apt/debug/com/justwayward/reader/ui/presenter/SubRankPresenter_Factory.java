package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubRankPresenter_Factory implements Factory<SubRankPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SubRankPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SubRankPresenter get() {
    return new SubRankPresenter(bookApiProvider.get());
  }

  public static Factory<SubRankPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SubRankPresenter_Factory(bookApiProvider);
  }
}
