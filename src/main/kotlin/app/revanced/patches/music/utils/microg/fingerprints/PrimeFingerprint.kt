package app.revanced.patches.music.utils.microg.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint

object PrimeFingerprint : MethodFingerprint(
    strings = listOf("com.google.android.GoogleCamera", "com.android.vending")
)