package com.example.cap3;

import com.example.estudo_android.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Capitulo3Activity extends Activity {
	
	@Override
	public void onCreate(Bundle incicle){
		super.onCreate(incicle);
		setContentView(R.layout.capitulo3);
		
		ImageView img = (ImageView)findViewById(R.id.imgImagem2);
		img.setImageResource(R.drawable.ic_action_search);
			
	}
	
	

}
