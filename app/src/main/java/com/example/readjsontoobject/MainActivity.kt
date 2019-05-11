package com.example.readjsontoobject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.readjsontoobject.models.Human
import com.example.readjsontoobject.utils.Utils
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonString = Utils.readJsonAsStringFromDisk(this, R.raw.big)
        val text = resources.openRawResource(R.raw.big)
            .bufferedReader().use { it.readText() }

        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java, Human::class.java)
        val moshiAdapter: JsonAdapter<List<Human>> = moshi.adapter(type)

        try {
            val humans = moshiAdapter.fromJson(text)
            humans?.first()
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}
