package com.nestia.biometriclib;

import android.os.CancellationSignal;

import androidx.annotation.NonNull;

interface IBiometricPromptImpl {

    void authenticate(@NonNull CancellationSignal cancel,
                      @NonNull BiometricPromptManager.OnBiometricIdentifyCallback callback);

}
