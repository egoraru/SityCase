package com.example.sitycase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView


class SlActivity : AppCompatActivity() {

    //Создаем массив разделов:
    private val titles = arrayOf(
        "Пожарная",
        "Полиция, ГИБДД, ДПС",
        "Скорая, поликлиника, приёмный покой",
        "Газовая",
        "Администрация, Совет депутатов",
        "ЖКХ, ТСЖ, УК",
        "Доставка еды",
        "Такси, перевозка грузов",
        "Погранслужба, ФСБ",
        "Служба занятости, биржа труда, соцзащита"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sl)

        val listView: ListView = findViewById(R.id.listView9)
        listView.adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, titles)
        listView.isTextFilterEnabled = true

        listView.onItemClickListener =
            OnItemClickListener { a, v, position, id ->
                val intent = Intent()
                intent.setClass(this@SlActivity, DetailActivity2::class.java)
                intent.putExtra("title", position)

                startActivity(intent)
            }
    }
}