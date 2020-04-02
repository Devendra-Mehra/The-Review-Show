// Generated by Dagger (https://dagger.dev).
package com.example.thereviewshow.homescreen.viewmodle;

import com.example.thereviewshow.util.StringHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeScreenViewModel_Factory implements Factory<HomeScreenViewModel> {
  private final Provider<StringHelper> stringHelperProvider;

  public HomeScreenViewModel_Factory(Provider<StringHelper> stringHelperProvider) {
    this.stringHelperProvider = stringHelperProvider;
  }

  @Override
  public HomeScreenViewModel get() {
    return new HomeScreenViewModel(stringHelperProvider.get());
  }

  public static HomeScreenViewModel_Factory create(Provider<StringHelper> stringHelperProvider) {
    return new HomeScreenViewModel_Factory(stringHelperProvider);
  }

  public static HomeScreenViewModel newInstance(StringHelper stringHelper) {
    return new HomeScreenViewModel(stringHelper);
  }
}