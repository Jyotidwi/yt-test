package app.revanced.patches.youtube.utils.microg.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint

object CastDynamiteModuleFingerprint : MethodFingerprint(
    strings = listOf("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl")
)