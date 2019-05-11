package com.example.readjsontoobject.utils

import android.content.Context
import androidx.annotation.RawRes
import java.io.ByteArrayOutputStream
import java.io.IOException

object Utils {
    fun readJsonAsStringFromDisk(context: Context, @RawRes rawRes: Int): String {
        val inputStream = context.resources.openRawResource(rawRes)
        val byteArrayOutputStream = ByteArrayOutputStream()

        var ctr: Int
        try {
            ctr = inputStream.read()
            while (ctr != -1) {
                byteArrayOutputStream.write(ctr)
                ctr = inputStream.read()
            }
            inputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return byteArrayOutputStream.toString()
    }
}
