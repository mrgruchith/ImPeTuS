package com.ruchith.impetus190;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter  extends BaseAdapter {

    Context c;
    String[] names ={"black widow","captain america","dead pool","docter strange"};
    int[] images={R.drawable.bw,R.drawable.ca,R.drawable.dead,R.drawable.docterstrange};


    public CustomAdapter(Context ctx)
    {
        this.c=ctx;
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
