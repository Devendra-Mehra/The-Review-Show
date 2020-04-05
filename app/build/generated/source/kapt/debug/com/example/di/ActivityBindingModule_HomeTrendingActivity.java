package com.example.di;

import com.example.thereviewshow.trending.ui.TrendingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_HomeTrendingActivity.TrendingActivitySubcomponent.class
)
public abstract class ActivityBindingModule_HomeTrendingActivity {
  private ActivityBindingModule_HomeTrendingActivity() {}

  @Binds
  @IntoMap
  @ClassKey(TrendingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrendingActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface TrendingActivitySubcomponent extends AndroidInjector<TrendingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrendingActivity> {}
  }
}
