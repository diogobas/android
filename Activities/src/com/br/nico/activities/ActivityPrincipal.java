package com.br.nico.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ActivityPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        
        Button botao1 = (Button) findViewById(R.id.botao1);
        botao1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(ActivityPrincipal.this, "Você clicou no botão 1!", Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(ActivityPrincipal.this, PrimeiraActivity.class);
				startActivity(intent);
			}
		});
		
		Button botao2 = (Button) findViewById(R.id.botao2);
		botao2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(ActivityPrincipal.this, "Você clicou no botão 2!", Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(ActivityPrincipal.this, SegundaActivity.class);
				startActivity(intent);
			}
		});
		
		Button botao3 = (Button) findViewById(R.id.botao3);
		botao3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(ActivityPrincipal.this, "Você clicou no botão 3!", Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(ActivityPrincipal.this, TerceiraActivity.class);
				startActivity(intent);
			}
		});
    }
    
}
