package com.justwayward.reader.component;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.activity.MainActivity;
import com.justwayward.reader.ui.activity.MainActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SettingActivity;
import com.justwayward.reader.ui.activity.WifiBookActivity;
import com.justwayward.reader.ui.fragment.RecommendFragment;
import com.justwayward.reader.ui.presenter.MainActivityPresenter;
import com.justwayward.reader.ui.presenter.RecommendPresenter;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMainComponent implements MainComponent {
  private AppComponent appComponent;

  private DaggerMainComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appComponent = builder.appComponent;
  }

  @Override
  public MainActivity inject(MainActivity activity) {
    return injectMainActivity(activity);
  }

  @Override
  public RecommendFragment inject(RecommendFragment fragment) {
    return injectRecommendFragment(fragment);
  }

  @Override
  public SettingActivity inject(SettingActivity activity) {
    return activity;
  }

  @Override
  public WifiBookActivity inject(WifiBookActivity activity) {
    return activity;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectMPresenter(
        instance,
        new MainActivityPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private RecommendFragment injectRecommendFragment(RecommendFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new RecommendPresenter(
            Preconditions.checkNotNull(
                appComponent.getContext(),
                "Cannot return null from a non-@Nullable component method"),
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public MainComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerMainComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
