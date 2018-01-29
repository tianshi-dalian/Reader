package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopCategoryListPresenter_Factory implements Factory<TopCategoryListPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public TopCategoryListPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public TopCategoryListPresenter get() {
    return new TopCategoryListPresenter(bookApiProvider.get());
  }

  public static Factory<TopCategoryListPresenter> create(Provider<BookApi> bookApiProvider) {
    return new TopCategoryListPresenter_Factory(bookApiProvider);
  }
}
