package com.example.sitycase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView


class PeActivity : AppCompatActivity() {

    //Создаем массив разделов:
    private val titles = arrayOf(
        "Поезда. Электрички",
        "Такси",
        "Автобус №15",
        "Автобус №126",
        "Автобус №182/185",
        "Автобус №183",
        "Автобус №184",
        "Автобус №810"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pe)

        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, titles)
        listView.isTextFilterEnabled = true

        listView.onItemClickListener =
            OnItemClickListener { a, v, position, id ->
                val intent = Intent()
                intent.setClass(this@PeActivity, DetailActivity::class.java)
                intent.putExtra("title", position)

                startActivity(intent)
            }
    }
}