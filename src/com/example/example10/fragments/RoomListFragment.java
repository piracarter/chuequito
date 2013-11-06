package com.example.example10.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.example10.R;
import com.example.example10.data.adapterRoom;
import com.example.example10.model.Room;

public class RoomListFragment extends ListFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        ArrayList<Room> rooms= new ArrayList<Room>();
        rooms.add(new Room("SUPERIOR ROOM, 1 KING", "Habitaci�n de 30m2 con una cama King Size, 2 buros, TV 29'', " +
        	"sillon de lectura y escritorio con amplio espacio para trabajo, " + 
        		"tel�fono, ba�o equipado con tina, regadera y WC", 1550.00, R.drawable.room_sencilla));
        rooms.add(new Room("SUPERIOR ROOM, 2 DOUBLE","Equipada con dos camas matrimoniales, TV de 29'', escritorio " +
        		"con amplio espacio para trabajo, tel�fono, ba�o equipado con tina, regadera y WC",
        		1890.00,R.drawable.room_doble));
        rooms.add(new Room("JUNIOR SUITE", "Amplia habitaci�n tipo apartamento con sala de estar y �rea de " + 
        		"rec�mara, equipada con 1 cama king size, aire acondicionado, minibar, calefacci�n, " +
        		"televisores, un peque�o comedor y ba�o completo con tina",2700.00,R.drawable.room_suitejunior));
        rooms.add(new Room("HABITACION PARA DISCAPACITADOS", "Habitaci�n de 30m2 equipada para atender las " +
        		"necesidades de las personas discapacitadas, 2 camas, TV de 29'', escritorio, " +
        		"tel�fono, cuarto de ba�o equipado con una barra de apoyo colocada a 1 metro de " +
        		"altura, tina, regadera y WC con barras especiales de seguridad",1590.00,R.drawable.room_discapacitados));
        
        
        adapterRoom adapter = new adapterRoom(getActivity(), rooms);
        
        setListAdapter(adapter);
	}
		
}
