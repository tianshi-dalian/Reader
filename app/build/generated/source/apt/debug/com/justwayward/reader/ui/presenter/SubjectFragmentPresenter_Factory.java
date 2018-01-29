package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectFragmentPresenter_Factory implements Factory<SubjectFragmentPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public SubjectFragmentPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public SubjectFragmentPresenter get() {
    return new SubjectFragmentPresenter(bookApiProvider.get());
  }

  public static Factory<SubjectFragmentPresenter> create(Provider<BookApi> bookApiProvider) {
    return new SubjectFragmentPresenter_Factory(bookApiProvider);
  }
}
