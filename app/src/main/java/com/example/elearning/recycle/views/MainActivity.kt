package com.example.elearning.recycle.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.elearning.R
import com.example.elearning.databinding.ActivityMainBinding
import com.example.elearning.recycle.views.adapter.UserAdapter
import com.example.elearning.recycle.views.models.UserData

class MainActivity : AppCompatActivity(), UserAdapter.OnClickListener {
    private lateinit var adapter: UserAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = findViewById<RecyclerView>(R.id.rvRecycler)

        val data = arrayListOf(
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),
            UserData(
                "Rajat Dashore", "21", "Android Developer"
            ),

            )
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        adapter = UserAdapter(data, this@MainActivity)
        recyclerView.adapter = adapter

    }

    override fun onClick(position: Int) {
        Toast.makeText(this, "Clicked $position", Toast.LENGTH_SHORT).show()
    }

}