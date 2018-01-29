package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectBookListDetailPresenter_Factory
    implements Factory<SubjectBookListDetailPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SubjectBookListDetailPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SubjectBookListDetailPresenter get() {
    return new SubjectBookListDetailPresenter(bookApiProvider.get());
  }

  public static Factory<SubjectBookListDetailPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SubjectBookListDetailPresenter_Factory(bookApiProvider);
  }
}
