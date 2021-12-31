package com.example.phoneinformation;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<Item> {
private int resourcelayout;
private Context mcontext;
public MyListAdapter(Context context,
                     int resoure,
                     List<Item> items){
    super(context,resoure,items);
    this.mcontext=context;
    this.resourcelayout=resoure;

}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View V= convertView;
        if(V==null){

            V= LayoutInflater.from(mcontext).inflate(resourcelayout,parent,false);
        Item p=getItem(position);
            if(p != null){
                TextView title=(TextView) V.findViewById(R.id.textView2);
                TextView value=(TextView) V.findViewById(R.id.textView3);

                if(title !=null){
                    title.setText(p.getTitle());
                }
                if(value !=null){
                    title.setText(p.getValue());
                }
            }
        }
        return V;
    }
}
