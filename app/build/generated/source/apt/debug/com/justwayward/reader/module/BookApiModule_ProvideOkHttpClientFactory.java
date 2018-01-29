package com.justwayward.reader.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final BookApiModule module;

  public BookApiModule_ProvideOkHttpClientFactory(BookApiModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(BookApiModule module) {
    return new BookApiModule_ProvideOkHttpClientFactory(module);
  }
}
