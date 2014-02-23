package com.example.starbuckskustom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Favorite extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View favorite = inflater.inflate(R.layout.favorite_frag, container, false);
		((TextView)favorite.findViewById(R.id.textView)).setText("Windows");
		return favorite;
	}
}