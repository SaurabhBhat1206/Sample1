package com.events.hanle.fragexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

	 @Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	   Bundle savedInstanceState) {
	  // TODO Auto-generated method stub
	  View myFragmentView = inflater.inflate(R.layout.fragmentlayout, container, false);
	  
	  return myFragmentView;
	 }

}
