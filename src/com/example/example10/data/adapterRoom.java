package com.example.example10.data;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.example10.model.Room;
import com.example.example10.R;

public class adapterRoom extends ArrayAdapter<Room> {
	private ArrayList<Room> data;
	private LayoutInflater inflater;
	
	public adapterRoom(Context context, ArrayList<Room> objects){
		super(context, -1, objects);
		this.data = objects;
		this.inflater = LayoutInflater.from(context);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		
		ViewHolder holder;
		Room current_room = data.get(position);
				
		if (convertView == null){
			convertView = inflater.inflate(R.layout.row_room, null);
			holder = new ViewHolder();		 
			holder.Titulo =  (TextView)convertView.findViewById(R.id.txt_titleRoom);
			holder.Vista =  (ImageView)convertView.findViewById(R.id.img_Room);
			convertView.setTag(holder);
		}else
		{
			holder = (ViewHolder)convertView.getTag();
			
		}
		holder.Vista.setImageResource(current_room.getVista());
		holder.Titulo.setText(current_room.getTitulo());
		
		
		return convertView;
	}
	
	private static class ViewHolder {
		private ImageView Vista;
		private TextView Titulo;
	}
}
