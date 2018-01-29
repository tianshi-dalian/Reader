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
public final class RecommendPresenter_Factory implements Factory<RecommendPresenter> {
  private final Provider<Context> mContextProvider;

  private final Provider<BookApi> bookApiProvider;

  public RecommendPresenter_Factory(
      Provider<Context> mContextProvider, Provider<BookApi> bookApiProvider) {
    this.mContextProvider = mContextProvider;
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public RecommendPresenter get() {
    return new RecommendPresenter(mContextProvider.get(), bookApiProvider.get());
  }

  public static Factory<RecommendPresenter> create(
      Provider<Context> mContextProvider, Provider<BookApi> bookApiProvider) {
    return new RecommendPresenter_Factory(mContextProvider, bookApiProvider);
  }
}
