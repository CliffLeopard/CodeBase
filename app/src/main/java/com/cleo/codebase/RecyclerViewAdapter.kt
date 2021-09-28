package com.cleo.codebase

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * author:gaoguanling
 * date:2021/9/28
 * time:15:44
 * email:gaoguanling@360.cn
 * link:
 */
class RecyclerViewAdapter(
    private val cases: List<Pair<String, String>>
) :
    RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    class RecyclerViewViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.case_item, parent, false)
        return RecyclerViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val case = cases[position]
        holder.textView.text = case.first
        holder.textView.setOnClickListener{
            val intent = Intent()
            intent.setClassName(Data.pkgName,case.second)
            holder.textView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cases.size
    }
}