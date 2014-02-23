package com.example.starbuckskustom;

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

public class MainMenu extends Fragment {
	SearchView searchView;
	ListView listView;
	SQLiteDatabase db;
	String sql;
	Cursor cursor;
	String data;
	SimpleCursorAdapter scAdapter;
	ImageView displayImage;
	TextView tv;
	LinearLayout lin;
	
	public static final String ROOT_DIR = "/data/data/com.example.starbuckskustom/databases/";
	private static final String DATABASE_NAME = "STARBUCKS.sqlite";
	private static final int db_VERSION = 1;
	final static String tableName = "ESPRESSO";
	private ArrayList<String> arrayList;
	private ArrayAdapter<String> aAdapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancdState){
		View mainMenu = inflater.inflate(R.layout.main_menu, container, false);
		tv = (TextView)mainMenu.findViewById(R.id.mainmenuInfo);
		tv.setText("  음료 종류를 선택하세요");
		arrayList = new ArrayList
	}
}