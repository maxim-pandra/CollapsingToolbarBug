package com.example.collapsingtoolbarbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        val recycler: RecyclerView = findViewById(R.id.list)
        recycler.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val adapter = DummyAdapter()
        recycler.adapter = adapter
        adapter.data = listOf(
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
            "text1",
            "text2",
            "text3",
        )

    }

    class DummyAdapter : RecyclerView.Adapter<DummyAdapter.ViewHolder>() {
        var data = listOf<String>()
            set(value) {
                field = value
                notifyDataSetChanged()
            }

        override fun getItemCount() = data.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.txt1.text = data[position]
            holder.txt2.text = data[position].uppercase().reversed()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(android.R.layout.simple_list_item_2, parent, false)
            )
        }


        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val txt1: TextView = itemView.findViewById(android.R.id.text1)
            val txt2: TextView = itemView.findViewById(android.R.id.text2)
        }
    }

}