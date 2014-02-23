package com.example.starbuckskustom;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
	ViewPager Tab;
	TabPagerAdapter TabAdapter;
	ActionBar actionBar;
	private Activity backPressCloseHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabAdapter = new TabPagerAdapter(getSupportFragmentManager());
		
		Tab = (ViewPager)findViewById(R.id.pager);
		Tab.setOnPageChangeListener(
				new ViewPager.SimpleOnPageChangeListener(){
					@Override
					public void onPageSelected(int position){
						actionBar = getActionBar();
						actionBar.setSelectedNavigationItem(position);
					}
				});
		Tab.setAdapter(TabAdapter);
		
		actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.TabListener tabListener = new ActionBar.TabListener(){
			
		@Override
		public void onTabReselected(android.app.ActionBar.TabListener tab,
			FragmentTransaction ft){
							
		}
						
		@Override
		public void onTabSeleted(ActionBar.TabListener tab, FragmentTransaction ft){
			Tab.setCurrentItem(tab.getPosition());
		}
								
						
		@Override
		public void onTabUnselected(android.app.ActionBar.TabListener tab,
			FragmentTransaction ft) {
							
		}};
		actionBar.addTab(actionBar.newTab().setText("이 앱은요").setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("MENU 음료").setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("인기 음료").setTabListener(tabListener));
	}
}

