package com.sopra.covoiturage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ConnectingActivity extends Activity {
	
	//private FacadeView facade;
	private EditText loginText;
	private EditText mdpText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connecting_page);
		
		loginText = (EditText) findViewById(R.id.loginField);
		mdpText = (EditText) findViewById(R.id.passwordField);
	}
	
	public void onConnectionButtonClick(View v) {
		//facade = new FacadeView();
		//facade.performConnect(loginText.getText().toString());
		
	}

}