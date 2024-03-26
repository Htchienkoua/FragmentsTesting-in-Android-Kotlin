 package com.howardtech.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

 class MainActivity : AppCompatActivity() {

     lateinit var replace : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replace = findViewById(R.id.buttonReplace)

        //lines of code to add a created fragment to an activity
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = FirstFragment()

        fragmentTransaction.add(R.id.frame, firstFragment) //parameters to attribute the 'firstFragment' to this activity fragmentTransaction manager class

        fragmentTransaction.commit()

        replace.setOnClickListener {

            val secondFragmentManager : FragmentManager = supportFragmentManager
            val secondFragmentTransaction : FragmentTransaction = secondFragmentManager.beginTransaction()

            val secondFragment = SecondFragment()
            secondFragmentTransaction.replace(R.id.frame, secondFragment)

            secondFragmentTransaction.commit()
        }
    }
}