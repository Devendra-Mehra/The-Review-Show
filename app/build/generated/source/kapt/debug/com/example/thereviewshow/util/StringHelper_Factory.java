// Generated by Dagger (https://dagger.dev).
package com.example.thereviewshow.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StringHelper_Factory implements Factory<StringHelper> {
  private final Provider<Context> contextProvider;

  public StringHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public StringHelper get() {
    return new StringHelper(contextProvider.get());
  }

  public static StringHelper_Factory create(Provider<Context> contextProvider) {
    return new StringHelper_Factory(contextProvider);
  }

  public static StringHelper newInstance(Context context) {
    return new StringHelper(context);
  }
}