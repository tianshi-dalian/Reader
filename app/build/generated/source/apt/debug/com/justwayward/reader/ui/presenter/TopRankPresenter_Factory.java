package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopRankPresenter_Factory implements Factory<TopRankPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public TopRankPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public TopRankPresenter get() {
    return new TopRankPresenter(bookApiProvider.get());
  }

  public static Factory<TopRankPresenter> create(Provider<BookApi> bookApiProvider) {
    return new TopRankPresenter_Factory(bookApiProvider);
  }
}
