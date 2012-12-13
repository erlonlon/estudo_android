package com.example.estudo_android;

import com.example.cap3.Capitulo3Activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void capitulo2OnClick(View v){
    	
    	startActivity(new Intent(getBaseContext(),Capitulo2Activity.class));
    }
    
    public void capitulo3OnClick(View v){
    	
    	startActivity(new Intent(getBaseContext(),Capitulo3Activity.class));
    }
}
