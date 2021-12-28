package com.example.sitycase

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.webkit.WebView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class PiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pi)

        val webView: WebView = findViewById(R.id.webView)

        val intent = intent
        //получаем строку и формируем имя ресурса
        val resName = "n" + intent.getIntExtra("title", 9)

        val context: Context = baseContext

        //читаем текстовый файл из ресурсов по имени
        val text: String = readRawTextFile(
            context, resources.getIdentifier(
                resName,
                "raw", "com.example.sitycase"
            )
        )
        webView.loadDataWithBaseURL(null, text, "text/html", "en_US", null)
    }

    //читаем текст из raw-ресурсов
    private fun readRawTextFile(context: Context, resId: Int): String {
        val inputStream: InputStream = context.resources.openRawResource(resId)
        val inputReader = InputStreamReader(inputStream)
        val buffReader = BufferedReader(inputReader)
        var line: String?
        val builder = StringBuilder()
        try {
            while (buffReader.readLine().also { line = it } != null) {
                builder.append(line)
                builder.append("\n")
            }
        } catch (e: IOException) {
            return e.localizedMessage
        }
        return builder.toString()
    }
}