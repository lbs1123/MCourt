package com.shinhan.mcourt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ListViewActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview = (ListView)findViewById(R.id.listview);
        String[] items = { "item1", "item2", "item3", "item4", "item5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this),
                android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
    }
}
