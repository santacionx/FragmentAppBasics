package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentapp.AFragment
import com.example.fragmentapp.BFragment
import com.example.fragmentapp.CFragment


class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = AFragment()
        val fragment2 = BFragment()
        val fragment3 = CFragment()


        button1.setOnClickListener {
            replaceFragment(fragment1)
        }

        button2.setOnClickListener {
            replaceFragment(fragment2)
        }

        button3.setOnClickListener {
            replaceFragment(fragment3)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            addToBackStack(null)
            commit()
        }
    }
}
