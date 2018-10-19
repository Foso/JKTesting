package de.jensklingenberg.jktesting;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.support.annotation.NonNull;
import android.support.test.internal.runner.RunnerArgs;
import android.support.test.runner.AndroidJUnitRunner;
import android.util.Log;

public class UiTestsRunner extends AndroidJUnitRunner {



  @Override
  @NonNull
  public Application newApplication(@NonNull ClassLoader cl, @NonNull String className, @NonNull Context context)
          throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    return Instrumentation.newApplication(TestApplication.class, context);
  }
}