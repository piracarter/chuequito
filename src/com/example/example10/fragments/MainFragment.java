package com.example.example10.fragments;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.example10.data.CustomPagerAdapter;
import com.example.example10.R;

@SuppressLint("NewApi")
public class MainFragment extends Fragment implements TabListener, ViewPager.OnPageChangeListener {

	CustomPagerAdapter adapter;
    private ViewPager view_pager;
    public static int orientation;
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		orientation = getResources().getConfiguration().orientation;
		String mensaje = null;
		if (orientation == Configuration.ORIENTATION_LANDSCAPE)
			mensaje = "Orientation LANDSCAPE";
		
		if (orientation == Configuration.ORIENTATION_PORTRAIT)
			mensaje = "Orientation PORTRAIT";
		
		Log.d("ORIENTATION_TEST", "getOrientation(): " + mensaje);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.view_pager, null);
        view_pager = (ViewPager) view.findViewById(R.id.pager);
        return view;
	}
	@SuppressLint("NewApi")
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		/*
		 *  SECCION PARA AGREGAR LOS TABULADORES AL FRAGMENTO.
		 */
		ActionBar bar = getActivity().getActionBar();
        bar.removeAllTabs();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.addTab(bar.newTab().setText("Oferta").setTabListener(this));
        bar.addTab(bar.newTab().setText("Comentarios").setTabListener(this));
        bar.addTab(bar.newTab().setText("Ubicacion").setTabListener(this));
        bar.setSubtitle("Hotel Chuequito");
        
        /* SECCION PARA EL VIEW PAGER */
        
        adapter = new CustomPagerAdapter(getActivity().getSupportFragmentManager());
        view_pager.setAdapter(adapter);
        view_pager.setOnPageChangeListener(this);
        Log.d("Debug", "Solo para verificar que este metodo se ejecuta cada vez que se cambia la orientacion");
	}
	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		Log.d("MainFragment","hizo click " + tab.getPosition());
		
	}
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	/*  ViewPager.OnPageChangeListener
	 * (non-Javadoc)
	 * @see android.support.v4.view.ViewPager.OnPageChangeListener#onPageScrollStateChanged(int)
	 */
	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		
	}
}
