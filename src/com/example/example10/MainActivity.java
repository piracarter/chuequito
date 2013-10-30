package com.example.example10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


import com.example.example10.fragments.MainFragment;



public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*	
		 * SECCION PARA DIBUJAR EL MAIN_FRAGMENT DENTRO DE LA MAIN_ACTIVITY
		 */
		Fragment f = new MainFragment();
		FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                       .replace(R.id.main_content, f)
                       .commit();
        
	}
}
