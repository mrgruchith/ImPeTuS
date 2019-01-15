package com.ruchith.impetus190;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter1  extends BaseAdapter {

    Context c;
    String[] names ={"thor","vision","wasp","wolverine"};
    int[] images={R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9};


    public CustomAdapter1(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {

        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {

        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.title,null);

        }
        TextView nametext=(TextView)view.findViewById(R.id.title_name);

        nametext.setText(names[pos]);
        return view;
    }
}

