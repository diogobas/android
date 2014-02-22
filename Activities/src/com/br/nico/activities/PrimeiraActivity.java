package com.br.nico.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrimeiraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.primeira);
		
		Button botao = (Button) findViewById(R.id.btVoltar);
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {				
				Intent intent = new Intent(PrimeiraActivity.this, ActivityPrincipal.class);
				startActivity(intent);
			}
		});
	}

}
