package br.gov.rn.tce.atividade03;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ColorFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_color, container, false);
	}
	
	public void setColor(int color) {

		View view = getView();

		if (view != null) {
			view.setBackgroundColor(color);
		}
	}
}
