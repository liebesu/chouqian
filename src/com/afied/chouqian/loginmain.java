package com.afied.chouqian;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.chouqian.R;

public class loginmain extends Activity implements OnClickListener {
    
	private Button button;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.loginmain);
	button =(Button) findViewById(R.id.registerbutton);
	button.setOnClickListener((android.view.View.OnClickListener) this);
	}


	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, login.class);
	}
	
	
}
