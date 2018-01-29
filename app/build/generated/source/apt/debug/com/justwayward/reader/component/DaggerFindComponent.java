package com.justwayward.reader.component;

import com.justwayward.reader.base.BaseRVFragment_MembersInjector;
import com.justwayward.reader.ui.activity.SubCategoryListActivity;
import com.justwayward.reader.ui.activity.SubCategoryListActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SubOtherHomeRankActivity;
import com.justwayward.reader.ui.activity.SubOtherHomeRankActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SubRankActivity;
import com.justwayward.reader.ui.activity.SubjectBookListActivity;
import com.justwayward.reader.ui.activity.SubjectBookListActivity_MembersInjector;
import com.justwayward.reader.ui.activity.SubjectBookListDetailActivity;
import com.justwayward.reader.ui.activity.SubjectBookListDetailActivity_MembersInjector;
import com.justwayward.reader.ui.activity.TopCategoryListActivity;
import com.justwayward.reader.ui.activity.TopCategoryListActivity_MembersInjector;
import com.justwayward.reader.ui.activity.TopRankActivity;
import com.justwayward.reader.ui.activity.TopRankActivity_MembersInjector;
import com.justwayward.reader.ui.fragment.SubCategoryFragment;
import com.justwayward.reader.ui.fragment.SubRankFragment;
import com.justwayward.reader.ui.fragment.SubjectFragment;
import com.justwayward.reader.ui.presenter.SubCategoryActivityPresenter;
import com.justwayward.reader.ui.presenter.SubCategoryFragmentPresenter;
import com.justwayward.reader.ui.presenter.SubRankPresenter;
import com.justwayward.reader.ui.presenter.SubjectBookListDetailPresenter;
import com.justwayward.reader.ui.presenter.SubjectBookListPresenter;
import com.justwayward.reader.ui.presenter.SubjectFragmentPresenter;
import com.justwayward.reader.ui.presenter.TopCategoryListPresenter;
import com.justwayward.reader.ui.presenter.TopRankPresenter;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFindComponent implements FindComponent {
  private AppComponent appComponent;

  private DaggerFindComponent(Builder builder) {
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
  public TopCategoryListActivity inject(TopCategoryListActivity activity) {
    return injectTopCategoryListActivity(activity);
  }

  @Override
  public SubCategoryListActivity inject(SubCategoryListActivity activity) {
    return injectSubCategoryListActivity(activity);
  }

  @Override
  public SubCategoryFragment inject(SubCategoryFragment fragment) {
    return injectSubCategoryFragment(fragment);
  }

  @Override
  public TopRankActivity inject(TopRankActivity activity) {
    return injectTopRankActivity(activity);
  }

  @Override
  public SubRankActivity inject(SubRankActivity activity) {
    return activity;
  }

  @Override
  public SubOtherHomeRankActivity inject(SubOtherHomeRankActivity activity) {
    return injectSubOtherHomeRankActivity(activity);
  }

  @Override
  public SubRankFragment inject(SubRankFragment fragment) {
    return injectSubRankFragment(fragment);
  }

  @Override
  public SubjectBookListActivity inject(SubjectBookListActivity subjectBookListActivity) {
    return injectSubjectBookListActivity(subjectBookListActivity);
  }

  @Override
  public SubjectFragment inject(SubjectFragment subjectFragment) {
    return injectSubjectFragment(subjectFragment);
  }

  @Override
  public SubjectBookListDetailActivity inject(SubjectBookListDetailActivity categoryListActivity) {
    return injectSubjectBookListDetailActivity(categoryListActivity);
  }

  private TopCategoryListActivity injectTopCategoryListActivity(TopCategoryListActivity instance) {
    TopCategoryListActivity_MembersInjector.injectMPresenter(
        instance,
        new TopCategoryListPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubCategoryListActivity injectSubCategoryListActivity(SubCategoryListActivity instance) {
    SubCategoryListActivity_MembersInjector.injectMPresenter(
        instance,
        new SubCategoryActivityPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubCategoryFragment injectSubCategoryFragment(SubCategoryFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new SubCategoryFragmentPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private TopRankActivity injectTopRankActivity(TopRankActivity instance) {
    TopRankActivity_MembersInjector.injectMPresenter(
        instance,
        new TopRankPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubOtherHomeRankActivity injectSubOtherHomeRankActivity(
      SubOtherHomeRankActivity instance) {
    SubOtherHomeRankActivity_MembersInjector.injectMPresenter(
        instance,
        new SubRankPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubRankFragment injectSubRankFragment(SubRankFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new SubRankPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubjectBookListActivity injectSubjectBookListActivity(SubjectBookListActivity instance) {
    SubjectBookListActivity_MembersInjector.injectMPresenter(
        instance,
        new SubjectBookListPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubjectFragment injectSubjectFragment(SubjectFragment instance) {
    BaseRVFragment_MembersInjector.injectMPresenter(
        instance,
        new SubjectFragmentPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  private SubjectBookListDetailActivity injectSubjectBookListDetailActivity(
      SubjectBookListDetailActivity instance) {
    SubjectBookListDetailActivity_MembersInjector.injectMPresenter(
        instance,
        new SubjectBookListDetailPresenter(
            Preconditions.checkNotNull(
                appComponent.getReaderApi(),
                "Cannot return null from a non-@Nullable component method")));
    return instance;
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public FindComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerFindComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
