package com.example.elearning.recycle.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.elearning.R
import com.example.elearning.recycle.views.models.UserData

class UserAdapter(val userData: ArrayList<UserData>, val listener: OnClickListener) :
    RecyclerView.Adapter<MyViewHolder>() {

    interface OnClickListener {
        fun onClick(position: Int)
    }


    override fun onCreateViewHolder(
        p0: ViewGroup, p1: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(p0.context)
            .inflate(R.layout.item_view, p0, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = userData[position].name
        holder.age.text = userData[position].age
        holder.profession.text = userData[position].profession

        holder.itemView.setOnClickListener {
            listener?.onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return userData.size
    }
}

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.name)
    val age = view.findViewById<TextView>(R.id.age)
    val profession = view.findViewById<TextView>(R.id.profession)


}
