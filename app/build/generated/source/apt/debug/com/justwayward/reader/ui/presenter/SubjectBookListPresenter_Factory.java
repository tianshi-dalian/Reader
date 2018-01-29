package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectBookListPresenter_Factory implements Factory<SubjectBookListPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SubjectBookListPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SubjectBookListPresenter get() {
    return new SubjectBookListPresenter(bookApiProvider.get());
  }

  public static Factory<SubjectBookListPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SubjectBookListPresenter_Factory(bookApiProvider);
  }
}
