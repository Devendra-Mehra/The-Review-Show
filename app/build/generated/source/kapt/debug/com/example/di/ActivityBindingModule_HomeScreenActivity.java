package com.example.di;

import com.example.thereviewshow.trending.ui.TrendingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_HomeScreenActivity.HomeScreenActivitySubcomponent.class
)
public abstract class ActivityBindingModule_HomeScreenActivity {
  private ActivityBindingModule_HomeScreenActivity() {}

  @Binds
  @IntoMap
  @ClassKey(TrendingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeScreenActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HomeScreenActivitySubcomponent extends AndroidInjector<TrendingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrendingActivity> {}
  }
}
