package app.revanced.patches.youtube.utils.videoid.general.fingerprint

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object VideoEndFingerprint : MethodFingerprint(
    opcodes = listOf(
        Opcode.INVOKE_VIRTUAL,
        Opcode.INVOKE_VIRTUAL_RANGE,
        Opcode.IGET_OBJECT,
        Opcode.IGET_OBJECT,
        Opcode.CHECK_CAST,
        Opcode.CONST_WIDE_32
    ),
    strings = listOf("Attempting to seek during an ad")
)