package com.example.sitycase


import android.content.Intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class ObActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob)

    }

    fun adm1(view: View?) {
        val intent = Intent(this@ObActivity, AdmActivity::class.java)
        startActivity(intent)
    }

    fun cbk1(view: View?) {
        val intent = Intent(this@ObActivity, CbkActivity::class.java)
        startActivity(intent)
    }

    fun vuo1(view: View?) {
        val intent = Intent(this@ObActivity, VuoActivity::class.java)
        startActivity(intent)
    }

    fun ent1(view: View?) {
        val intent = Intent(this@ObActivity, EntActivity::class.java)
        startActivity(intent)
    }

    fun tel1(view: View?) {
        val intent = Intent(this@ObActivity, TelActivity::class.java)
        startActivity(intent)
    }

    fun sve1(view: View?) {
        val intent = Intent(this@ObActivity, SveActivity::class.java)
        startActivity(intent)
    }


}