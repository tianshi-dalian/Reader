package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubCategoryActivityPresenter_Factory
    implements Factory<SubCategoryActivityPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SubCategoryActivityPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SubCategoryActivityPresenter get() {
    return new SubCategoryActivityPresenter(bookApiProvider.get());
  }

  public static Factory<SubCategoryActivityPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SubCategoryActivityPresenter_Factory(bookApiProvider);
  }
}
