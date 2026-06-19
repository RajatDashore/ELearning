package com.example.elearning.navigation.views

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.elearning.R
import com.example.elearning.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private val TAG = "HomeActivity"
    private lateinit var binding: ActivityHomeBinding
    private var index = 0

    //private val FIRST: Int = R.layout.fragment_first
    // private val SECOND: Int = R.layout.fragment_second
    // private val THIRD: Int = R.layout.fragment_third
    // private val FOURTH: Int = R.layout.fragment_fourth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment
        if (navHostFragment == null) {
            Log.e("HomeActivity", "NavHostFragment not found")
            return
        }
        val navController = navHostFragment?.navController


        navController?.addOnDestinationChangedListener { controller, destination, bundle ->
            if (destination.id == R.id.fourthFragment) {
                binding.btnNext.visibility = View.GONE
            } else {
                binding.btnNext.visibility = View.VISIBLE
            }


            if (destination.id == R.id.firstFragment) {
                binding.btnPre.visibility = View.GONE
            } else {
                binding.btnPre.visibility = View.VISIBLE
            }
            Log.d(TAG, "onCreate: ")

        }

        binding.floatingActionButton.setOnClickListener {
            when (index) {
                0 -> {
                    navController?.navigate(R.id.action_firstFragment_to_thirdFragment)
                    index = 2
                }

                1 -> {
                    navController?.navigate(R.id.action_secondFragment_to_fourthFragment)
                    index = 3
                }

                2 -> {
                    navController?.navigate(R.id.action_thirdFragment_to_firstFragment)
                    index = 0
                }

                3 -> {
                    navController?.navigate(R.id.action_fourthFragment_to_secondFragment)
                    index = 1
                }

            }
        }


        binding.btnPre.setOnClickListener {
            when (index) {
                0 -> {
                    navController!!.navigate(R.id.action_firstFragment_to_fourthFragment)
                    index = 3
                }

                1 -> {
                    navController!!.navigate(R.id.action_secondFragment_to_firstFragment)
                    index--
                }

                2 -> {
                    navController!!.navigate(R.id.action_thirdFragment_to_secondkFragment)
                    index--
                }

                3 -> {
                    navController!!.navigate(R.id.action_fourthFragment_to_thirdFragment)
                    index--
                }
            }
        }

        binding.btnNext.setOnClickListener {
            when (index) {
                0 -> {
                    navController!!.navigate(R.id.action_firstFragment_to_secondFragment)
                    index++
                }

                1 -> {
                    navController!!.navigate(R.id.action_secondFragment_to_thirdFragment)
                    index++
                }

                2 -> {
                    navController!!.navigate(R.id.action_thirdFragment_to_fourthFragment)
                    index++
                }

                3 -> {
                    navController!!.navigate(R.id.action_fourthFragment_to_firstFragment)
                    index = 0
                }
            }
        }

    }
}
