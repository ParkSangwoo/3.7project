package com.learn2crack.tab;

import java.util.ArrayList;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;


public class Ios extends Fragment {
	SearchView searchView;
	 ListView list;
	 //DatabaseHelper dbHelper;
	 SQLiteDatabase db;
	 String sql;
	 Cursor cursor;
	 String data;
	 SimpleCursorAdapter adapter;
	 ImageView displayImage;
	 TextView tv;
	 LinearLayout lin;
	 public static final String ROOT_DIR = "/data/data/com.learn2crack.tab/databases/"; 
	 private static final String DATABASE_NAME = "STARBUCKS.sqlite";
	 private static final int db_VERSION = 2; 
	 final static String tableName = "ESPRESSO";
	 private ArrayList<String> arrayList;
	 private ArrayAdapter<String> adapters;
	 
	 @Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View ios = inflater.inflate(R.layout.ios_frag, container, false);
	        tv = (TextView)ios.findViewById(R.id.tV2);
	        String im = "이미지";
	        String br = "브랜드";
	        String cofn = "커피 이름";
	        String chr = "가격";
	        tv.setText("  음료 종류를 선택하세요");
	        Toast.makeText(getActivity(), "온 크리에이트", Toast.LENGTH_SHORT).show();
	        arrayList = new ArrayList<String>();
	        arrayList.add("에스프레소");
	        arrayList.add("브루드 커피");
	        arrayList.add("프라푸치노");
	        arrayList.add("티 및 기타음료");

	        adapters = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arrayList);

	        list = (ListView)ios.findViewById(R.id.list);
	        list.setAdapter(adapters);
	        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	        
	        list.setOnItemClickListener(new OnItemClickListener(){
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id){
	        	String str = (String)adapters.getItem(position);
	        	Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT).show();
	        }
	    });
	        
	        ((TextView)ios.findViewById(R.id.textView)).setText("iOS");
	        return ios;
	}
	 
	 
}
