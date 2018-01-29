package com.justwayward.reader.component;

import android.content.Context;
import com.justwayward.reader.api.BookApi;
import com.justwayward.reader.module.AppModule;
import com.justwayward.reader.module.BookApiModule;
import com.justwayward.reader.module.BookApiModule_ProvideBookServiceFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private BookApiModule bookApiModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
    this.bookApiModule = builder.bookApiModule;
  }

  @Override
  public Context getContext() {
    return Preconditions.checkNotNull(
        appModule.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  @Override
  public BookApi getReaderApi() {
    return Preconditions.checkNotNull(
        BookApiModule_ProvideBookServiceFactory.proxyProvideBookService(
            bookApiModule,
            Preconditions.checkNotNull(
                bookApiModule.provideOkHttpClient(),
                "Cannot return null from a non-@Nullable @Provides method")),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static final class Builder {
    private AppModule appModule;

    private BookApiModule bookApiModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (bookApiModule == null) {
        this.bookApiModule = new BookApiModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder bookApiModule(BookApiModule bookApiModule) {
      this.bookApiModule = Preconditions.checkNotNull(bookApiModule);
      return this;
    }
  }
}
