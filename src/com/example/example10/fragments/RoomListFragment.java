package com.example.example10.fragments;

import java.util.ArrayList;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.example10.R;
import com.example.example10.RoomDetailActivity;
import com.example.example10.data.adapterRoom;
import com.example.example10.model.Room;

public class RoomListFragment extends Fragment implements OnItemClickListener {
	private ListView list;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
		View view = inflater.inflate(R.layout.roomlistlayout, null);
        list = (ListView)view.findViewById(R.id.list);
        return view;

	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        ArrayList<Room> rooms= new ArrayList<Room>();
        rooms.add(new Room("SUPERIOR ROOM, 1 KING", "Habitación de 30m2 con una cama King Size, 2 buros, TV 29'', " +
        	"sillon de lectura y escritorio con amplio espacio para trabajo, " + 
        		"teléfono, baño equipado con tina, regadera y WC", 1550.00, R.drawable.room_sencilla));
        rooms.add(new Room("SUPERIOR ROOM, 2 DOUBLE","Equipada con dos camas matrimoniales, TV de 29'', escritorio " +
        		"con amplio espacio para trabajo, teléfono, baño equipado con tina, regadera y WC",
        		1890.00,R.drawable.room_doble));
        rooms.add(new Room("JUNIOR SUITE", "Amplia habitación tipo apartamento con sala de estar y área de " + 
        		"recámara, equipada con 1 cama king size, aire acondicionado, minibar, calefacción, " +
        		"televisores, un pequeño comedor y baño completo con tina",2700.00,R.drawable.room_suitejunior));
        rooms.add(new Room("HABITACION PARA DISCAPACITADOS", "Habitación de 30m2 equipada para atender las " +
        		"necesidades de las personas discapacitadas, 2 camas, TV de 29'', escritorio, " +
        		"teléfono, cuarto de baño equipado con una barra de apoyo colocada a 1 metro de " +
        		"altura, tina, regadera y WC con barras especiales de seguridad",1590.00,R.drawable.room_discapacitados));
        
        
        adapterRoom adapter = new adapterRoom(getActivity(), rooms);
        list.setOnItemClickListener(this);
        list.setAdapter(adapter);
        
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        Room clicked_room = (Room) list.getItemAtPosition(arg2);
        if (MainFragment.orientation ==  Configuration.ORIENTATION_PORTRAIT ) {
	        Intent intent = new Intent (getActivity(), RoomDetailActivity.class);
	        intent.putExtra("DESC", clicked_room.getDescripcion());
	        intent.putExtra("PRECIO", clicked_room.getPrecio());
	        intent.putExtra("TITULO", clicked_room.getTitulo());
	        startActivity(intent);
        }
    
        if (MainFragment.orientation ==  Configuration.ORIENTATION_LANDSCAPE ) {
            FragmentManager fragmentManager = getFragmentManager();
            
            RoomDetailFragment f = new RoomDetailFragment();
            f.init(clicked_room.getDescripcion(), clicked_room.getPrecio());
            
            fragmentManager.beginTransaction()
                           .replace(R.id.details, f)
                           .commit();

        }
	}
	
		
}
