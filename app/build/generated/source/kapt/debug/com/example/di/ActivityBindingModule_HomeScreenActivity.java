package com.example.di;

import com.example.thereviewshow.homescreen.ui.HomeScreenActivity;
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
  @ClassKey(HomeScreenActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeScreenActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HomeScreenActivitySubcomponent extends AndroidInjector<HomeScreenActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeScreenActivity> {}
  }
}
