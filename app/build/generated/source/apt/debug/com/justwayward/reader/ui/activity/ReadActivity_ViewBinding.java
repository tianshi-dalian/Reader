// Generated code from Butter Knife. Do not modify!
package com.justwayward.reader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.justwayward.reader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadActivity_ViewBinding<T extends ReadActivity> implements Unbinder {
  protected T target;

  private View view2131296381;

  private View view2131296574;

  private View view2131296570;

  private View view2131296572;

  private View view2131296576;

  private View view2131296573;

  private View view2131296575;

  private View view2131296571;

  private View view2131296577;

  private View view2131296384;

  private View view2131296385;

  private View view2131296598;

  private View view2131296599;

  private View view2131296559;

  private View view2131296569;

  private View view2131296586;

  @UiThread
  public ReadActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ivBack, "field 'mIvBack' and method 'onClickBack'");
    target.mIvBack = Utils.castView(view, R.id.ivBack, "field 'mIvBack'", ImageView.class);
    view2131296381 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadReading, "field 'mTvBookReadReading' and method 'readBook'");
    target.mTvBookReadReading = Utils.castView(view, R.id.tvBookReadReading, "field 'mTvBookReadReading'", TextView.class);
    view2131296574 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.readBook();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadCommunity, "field 'mTvBookReadCommunity' and method 'onClickCommunity'");
    target.mTvBookReadCommunity = Utils.castView(view, R.id.tvBookReadCommunity, "field 'mTvBookReadCommunity'", TextView.class);
    view2131296570 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCommunity();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadIntroduce, "field 'mTvBookReadChangeSource' and method 'onClickIntroduce'");
    target.mTvBookReadChangeSource = Utils.castView(view, R.id.tvBookReadIntroduce, "field 'mTvBookReadChangeSource'", TextView.class);
    view2131296572 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickIntroduce();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadSource, "field 'mTvBookReadSource' and method 'onClickSource'");
    target.mTvBookReadSource = Utils.castView(view, R.id.tvBookReadSource, "field 'mTvBookReadSource'", TextView.class);
    view2131296576 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSource();
      }
    });
    target.flReadWidget = Utils.findRequiredViewAsType(source, R.id.flReadWidget, "field 'flReadWidget'", FrameLayout.class);
    target.mLlBookReadTop = Utils.findRequiredViewAsType(source, R.id.llBookReadTop, "field 'mLlBookReadTop'", LinearLayout.class);
    target.mTvBookReadTocTitle = Utils.findRequiredViewAsType(source, R.id.tvBookReadTocTitle, "field 'mTvBookReadTocTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tvBookReadMode, "field 'mTvBookReadMode' and method 'onClickChangeMode'");
    target.mTvBookReadMode = Utils.castView(view, R.id.tvBookReadMode, "field 'mTvBookReadMode'", TextView.class);
    view2131296573 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickChangeMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadSettings, "field 'mTvBookReadSettings' and method 'setting'");
    target.mTvBookReadSettings = Utils.castView(view, R.id.tvBookReadSettings, "field 'mTvBookReadSettings'", TextView.class);
    view2131296575 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setting();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadDownload, "field 'mTvBookReadDownload' and method 'downloadBook'");
    target.mTvBookReadDownload = Utils.castView(view, R.id.tvBookReadDownload, "field 'mTvBookReadDownload'", TextView.class);
    view2131296571 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.downloadBook();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvBookReadToc, "field 'mTvBookReadToc' and method 'onClickToc'");
    target.mTvBookReadToc = Utils.castView(view, R.id.tvBookReadToc, "field 'mTvBookReadToc'", TextView.class);
    view2131296577 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickToc();
      }
    });
    target.mLlBookReadBottom = Utils.findRequiredViewAsType(source, R.id.llBookReadBottom, "field 'mLlBookReadBottom'", LinearLayout.class);
    target.mRlBookReadRoot = Utils.findRequiredViewAsType(source, R.id.rlBookReadRoot, "field 'mRlBookReadRoot'", RelativeLayout.class);
    target.mTvDownloadProgress = Utils.findRequiredViewAsType(source, R.id.tvDownloadProgress, "field 'mTvDownloadProgress'", TextView.class);
    target.rlReadAaSet = Utils.findRequiredViewAsType(source, R.id.rlReadAaSet, "field 'rlReadAaSet'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ivBrightnessMinus, "field 'ivBrightnessMinus' and method 'brightnessMinus'");
    target.ivBrightnessMinus = Utils.castView(view, R.id.ivBrightnessMinus, "field 'ivBrightnessMinus'", ImageView.class);
    view2131296384 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.brightnessMinus();
      }
    });
    target.seekbarLightness = Utils.findRequiredViewAsType(source, R.id.seekbarLightness, "field 'seekbarLightness'", SeekBar.class);
    view = Utils.findRequiredView(source, R.id.ivBrightnessPlus, "field 'ivBrightnessPlus' and method 'brightnessPlus'");
    target.ivBrightnessPlus = Utils.castView(view, R.id.ivBrightnessPlus, "field 'ivBrightnessPlus'", ImageView.class);
    view2131296385 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.brightnessPlus();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvFontsizeMinus, "field 'tvFontsizeMinus' and method 'fontsizeMinus'");
    target.tvFontsizeMinus = Utils.castView(view, R.id.tvFontsizeMinus, "field 'tvFontsizeMinus'", TextView.class);
    view2131296598 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fontsizeMinus();
      }
    });
    target.seekbarFontSize = Utils.findRequiredViewAsType(source, R.id.seekbarFontSize, "field 'seekbarFontSize'", SeekBar.class);
    view = Utils.findRequiredView(source, R.id.tvFontsizePlus, "field 'tvFontsizePlus' and method 'fontsizePlus'");
    target.tvFontsizePlus = Utils.castView(view, R.id.tvFontsizePlus, "field 'tvFontsizePlus'", TextView.class);
    view2131296599 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fontsizePlus();
      }
    });
    target.rlReadMark = Utils.findRequiredViewAsType(source, R.id.rlReadMark, "field 'rlReadMark'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.tvAddMark, "field 'tvAddMark' and method 'addBookMark'");
    target.tvAddMark = Utils.castView(view, R.id.tvAddMark, "field 'tvAddMark'", TextView.class);
    view2131296559 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addBookMark();
      }
    });
    target.lvMark = Utils.findRequiredViewAsType(source, R.id.lvMark, "field 'lvMark'", ListView.class);
    target.cbVolume = Utils.findRequiredViewAsType(source, R.id.cbVolume, "field 'cbVolume'", CheckBox.class);
    target.cbAutoBrightness = Utils.findRequiredViewAsType(source, R.id.cbAutoBrightness, "field 'cbAutoBrightness'", CheckBox.class);
    target.gvTheme = Utils.findRequiredViewAsType(source, R.id.gvTheme, "field 'gvTheme'", GridView.class);
    view = Utils.findRequiredView(source, R.id.tvBookMark, "method 'onClickMark'");
    view2131296569 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickMark();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvClear, "method 'clearBookMark'");
    view2131296586 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearBookMark();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mIvBack = null;
    target.mTvBookReadReading = null;
    target.mTvBookReadCommunity = null;
    target.mTvBookReadChangeSource = null;
    target.mTvBookReadSource = null;
    target.flReadWidget = null;
    target.mLlBookReadTop = null;
    target.mTvBookReadTocTitle = null;
    target.mTvBookReadMode = null;
    target.mTvBookReadSettings = null;
    target.mTvBookReadDownload = null;
    target.mTvBookReadToc = null;
    target.mLlBookReadBottom = null;
    target.mRlBookReadRoot = null;
    target.mTvDownloadProgress = null;
    target.rlReadAaSet = null;
    target.ivBrightnessMinus = null;
    target.seekbarLightness = null;
    target.ivBrightnessPlus = null;
    target.tvFontsizeMinus = null;
    target.seekbarFontSize = null;
    target.tvFontsizePlus = null;
    target.rlReadMark = null;
    target.tvAddMark = null;
    target.lvMark = null;
    target.cbVolume = null;
    target.cbAutoBrightness = null;
    target.gvTheme = null;

    view2131296381.setOnClickListener(null);
    view2131296381 = null;
    view2131296574.setOnClickListener(null);
    view2131296574 = null;
    view2131296570.setOnClickListener(null);
    view2131296570 = null;
    view2131296572.setOnClickListener(null);
    view2131296572 = null;
    view2131296576.setOnClickListener(null);
    view2131296576 = null;
    view2131296573.setOnClickListener(null);
    view2131296573 = null;
    view2131296575.setOnClickListener(null);
    view2131296575 = null;
    view2131296571.setOnClickListener(null);
    view2131296571 = null;
    view2131296577.setOnClickListener(null);
    view2131296577 = null;
    view2131296384.setOnClickListener(null);
    view2131296384 = null;
    view2131296385.setOnClickListener(null);
    view2131296385 = null;
    view2131296598.setOnClickListener(null);
    view2131296598 = null;
    view2131296599.setOnClickListener(null);
    view2131296599 = null;
    view2131296559.setOnClickListener(null);
    view2131296559 = null;
    view2131296569.setOnClickListener(null);
    view2131296569 = null;
    view2131296586.setOnClickListener(null);
    view2131296586 = null;

    this.target = null;
  }
}
