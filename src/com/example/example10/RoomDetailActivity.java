package com.example.example10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class RoomDetailActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
        setContentView(R.layout.roomdetail);
        Intent intent = getIntent();
        String descripcion,  titulo;
        double precio;
        descripcion = intent.getStringExtra("DESC");
        precio = intent.getDoubleExtra("PRECIO", 0);
        titulo = intent.getStringExtra("TITULO");
        TextView textDescripcion = (TextView)findViewById(R.id.textdescription);
        TextView textPrecio = (TextView)findViewById(R.id.textprice);
        
        textDescripcion.setText(descripcion);
        textPrecio.setText("" + precio);
        
        setTitle(titulo);
	}
}
