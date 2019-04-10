package br.gov.rn.tce.atividade03;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements ButtonFragment.ChangeColorListener {

	private ColorFragment colorFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		

		colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.fra_color);

	}

	@Override
	public void changeColor(int color) {

		colorFragment.setColor(color);
	}
}
