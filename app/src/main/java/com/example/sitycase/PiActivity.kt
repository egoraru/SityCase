package com.example.sitycase

import android.annotation.TargetApi
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class PiActivity : AppCompatActivity() {

            private lateinit var webView: WebView

            override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_pi)
            val webView = findViewById<WebView>(R.id.webView)
            webView.webViewClient = MyWebViewClient()
            // включаем поддержку JavaScript
            webView.settings.javaScriptEnabled = true
            // указываем страницу загрузки
            webView.loadUrl("https://egora.ru/gis.html") }

                private class MyWebViewClient : WebViewClient() {
                @TargetApi(Build.VERSION_CODES.N)
                override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                    view.loadUrl(request.url.toString())
                    return true
                }

                // Для старых устройств
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return true
                }
                }

                override fun onBackPressed() {
                    if (webView.canGoBack()) {
                        webView.goBack()
                    } else {
                        super.onBackPressed()
                    }
                }

        }





/*    private class MyWebViewClient : WebViewClient() {
        @TargetApi(Build.VERSION_CODES.N)
        override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
            view.loadUrl(request.url.toString())
            return true
        }

        // Для старых устройств
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }
    }*/







/*import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.InputStreamReader


class PiActivity : AppCompatActivity() {
    private var edit: EditText? = null
    private var txtShow: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pi)
        edit = FindViewById(R.id.editText2) as EditText?
        txtShow = FindViewById(R.id.textView16) as TextView?
    }

    private fun FindViewById(editText2: Any): Any {
        TODO("Not yet implemented")
    }

    fun read(view: View?) {
        val fileInput = openFileInput("example.txt")
        val reader = InputStreamReader(fileInput)
        val buffer = BufferedReader(reader)
        val strBuffer = StringBuffer()
        var lines: String
        while (buffer.readLine().also { lines = it } != null) {
            strBuffer.append(
                """
    $lines
    
    """.trimIndent()
            )
        }
        txtShow!!.text = strBuffer.toString()
    }

    fun write(view: View?) {
        val myTxt = edit!!.text.toString()
        val fileOut = openFileOutput("example.txt", MODE_PRIVATE)
        val fileOutput = null
        fileOutput.write(myTxt.toByteArray())
        openFileOutput()!!.close()
        edit!!.setText("")
        Toast.makeText(this@PiActivity, "Текст сохранён", Toast.LENGTH_LONG).show()
    }

    private fun openFileOutput(): AutoCloseable? {
        return null
    }
}

private fun Nothing?.write(toByteArray: ByteArray) {
    TODO("Not yet implemented")
}*/
