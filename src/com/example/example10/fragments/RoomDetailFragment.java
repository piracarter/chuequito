package com.example.example10.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.example10.R;

public class RoomDetailFragment extends Fragment{
    private View view;
	private String desc;
	private double precio;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	view = inflater.inflate(R.layout.roomdetail, null);
    	TextView textDesc = (TextView) view.findViewById(R.id.textdescription);
    	TextView textPrecio = (TextView) view.findViewById(R.id.textprice);
    	textDesc.setText(desc);
    	textPrecio.setText("" + precio);
    	return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
    	super.onActivityCreated(savedInstanceState);
    }
    public void init(String desc, double precio){
    	this.desc= desc;
    	this.precio = precio;
    	
    }
}
