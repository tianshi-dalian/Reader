package com.justwayward.reader.module;

import com.justwayward.reader.api.BookApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookApiModule_ProvideBookServiceFactory implements Factory<BookApi> {
  private final BookApiModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public BookApiModule_ProvideBookServiceFactory(
      BookApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public BookApi get() {
    return Preconditions.checkNotNull(
        module.provideBookService(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BookApi> create(
      BookApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new BookApiModule_ProvideBookServiceFactory(module, okHttpClientProvider);
  }

  public static BookApi proxyProvideBookService(BookApiModule instance, OkHttpClient okHttpClient) {
    return instance.provideBookService(okHttpClient);
  }
}
