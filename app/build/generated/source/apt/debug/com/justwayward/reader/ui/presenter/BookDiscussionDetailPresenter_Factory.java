package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookDiscussionDetailPresenter_Factory
    implements Factory<BookDiscussionDetailPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public BookDiscussionDetailPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public BookDiscussionDetailPresenter get() {
    return new BookDiscussionDetailPresenter(bookApiProvider.get());
  }

  public static Factory<BookDiscussionDetailPresenter> create(Provider<BookApi> bookApiProvider) {
    return new BookDiscussionDetailPresenter_Factory(bookApiProvider);
  }
}
