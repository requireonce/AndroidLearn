package com.danxx.views;

import android.app.Activity;
import android.os.Bundle;

import danxx.library.focusview.FocusLinearLayout;

public class ActivityTest extends Activity {
		
	private FocusLinearLayout focusLinearLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_test);
		
		focusLinearLayout = (FocusLinearLayout) findViewById(R.id.focusLinearLayout);
		
//		focusLinearLayout.setFocusMovingDuration(0);
//		focusLinearLayout.setFocusHighlightDrawable(R.drawable.default_focus);
//		focusLinearLayout.setFocusScale(1.4f,1.4f);

//		View view = LayoutInflater.from(this).inflate(R.layout.focus_item_view,null);
//
//		focusLinearLayout.addChildView(view, 10, 30, 0, 0);
//
//		View view1 = LayoutInflater.from(this).inflate(R.layout.focus_item_view,null);
//		focusLinearLayout.addChildView(view1, 10, 0, 0, 0);
	}

}
