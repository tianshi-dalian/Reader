package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDiscussionPresenter_Factory implements Factory<BookDiscussionPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookDiscussionPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookDiscussionPresenter get() {
    return new BookDiscussionPresenter(bookApiProvider.get());
  }

  public static Factory<BookDiscussionPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookDiscussionPresenter_Factory(bookApiProvider);
  }
}
