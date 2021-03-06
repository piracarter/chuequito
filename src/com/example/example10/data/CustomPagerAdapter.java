package com.example.example10.data;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.example10.fragments.RoomListFragment;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {
	
	private Fragment[] fragments;
	
	public CustomPagerAdapter(FragmentManager fm) {
		super(fm);
		fragments = new Fragment[] {
				new RoomListFragment(),
				new RoomListFragment(),
				new RoomListFragment()
		};
		
	}

	@Override
	public Fragment getItem(int arg0) {
		return fragments[arg0];
	}

	@Override
	public int getCount() {
		return fragments.length;
	}

}
