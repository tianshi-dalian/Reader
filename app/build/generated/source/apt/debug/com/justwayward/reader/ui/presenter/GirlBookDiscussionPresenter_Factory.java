package com.justwayward.reader.ui.presenter;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GirlBookDiscussionPresenter_Factory
    implements Factory<GirlBookDiscussionPresenter> {
  private final Provider<BookApi> bookApiProvider;

  public GirlBookDiscussionPresenter_Factory(Provider<BookApi> bookApiProvider) {
    this.bookApiProvider = bookApiProvider;
  }

  @Override
  public GirlBookDiscussionPresenter get() {
    return new GirlBookDiscussionPresenter(bookApiProvider.get());
  }

  public static Factory<GirlBookDiscussionPresenter> create(Provider<BookApi> bookApiProvider) {
    return new GirlBookDiscussionPresenter_Factory(bookApiProvider);
  }
}
