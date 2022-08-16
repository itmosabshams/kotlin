package com.shams.kotiln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

import com.shams.kotiln.R.id.home_test
import com.shams.kotiln.databinding.ActivityMainBinding
import com.shams.kotiln.fragment.CategoryFragment
import com.shams.kotiln.fragment.MainFragment
import com.shams.kotiln.fragment.ProfileFragment
import com.shams.kotiln.fragment.adapter.TabAdapter


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragmentLists = mutableListOf<Fragment>()
        fragmentLists.add(MainFragment())
        fragmentLists.add(CategoryFragment())
        fragmentLists.add(ProfileFragment())
        var adapters = TabAdapter(this , fragmentLists)
        binding.pager.adapter = adapters
        binding.bottom.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home_test -> {
                 binding.pager.currentItem = 0
                    true
                }




                R.id.call_test -> {
                    binding.pager.currentItem = 1
                    true

                }
                R.id.note_test -> {
                    binding.pager.currentItem = 2
                    true

                }

                else -> {
                    false
                }
            }
        }
    }
}