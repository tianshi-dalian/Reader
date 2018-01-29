package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDetailDiscussionPresenter_Factory
    implements Factory<BookDetailDiscussionPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookDetailDiscussionPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookDetailDiscussionPresenter get() {
    return new BookDetailDiscussionPresenter(bookApiProvider.get());
  }

  public static Factory<BookDetailDiscussionPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookDetailDiscussionPresenter_Factory(bookApiProvider);
  }
}
