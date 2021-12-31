package com.example.phoneinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter myListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        TextView it=(TextView) findViewById(R.id.textView);
        it.setText(
                "HOST"+Build.HOST+"\n"+
                        "ID"+Build.ID+"\n"+
                        "BRAND"+Build.BRAND+"\n"+
                        "TYPE"+Build.TYPE+"\n"+
                        "USER"+Build.USER+"\n"+

                        "VERSION CODE: "+Build.VERSION.RELEASE+"\n");

         ArrayList<Item> cities=new ArrayList<Item>();
        cities.add(new Item("A",Build.HOST));
        cities.add(new Item("A",Build.TYPE));
        cities.add(new Item("A",Build.VERSION.RELEASE));

       myListAdapter=new MyListAdapter(this,
                R.layout.resourcelayout,cities);
        listView.setAdapter(myListAdapter);

    }
}