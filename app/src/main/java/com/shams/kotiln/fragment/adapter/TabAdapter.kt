package com.shams.kotiln.fragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(activity :FragmentActivity , list: List<Fragment>) :FragmentStateAdapter(activity!!) {
   var itemList = list

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun createFragment(position: Int): Fragment {
        return itemList.get(position)
    }
}