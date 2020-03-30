// Generated by Dagger (https://dagger.dev).
package com.example.thereviewshow.application;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TheReviewShowApplication_MembersInjector implements MembersInjector<TheReviewShowApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public TheReviewShowApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<TheReviewShowApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new TheReviewShowApplication_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(TheReviewShowApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}