package com.ruchith.impetus190;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent i=getIntent();
        pos=i.getExtras().getInt("Position");

        final CustomAdapter adapter= new CustomAdapter(this);
        final CustomAdapter1 adapter1=new CustomAdapter1(this);
        final TextView name=(TextView)findViewById(R.id.desc_name);
        final ImageView img=(ImageView)findViewById(R.id.desc_image);

        img.setImageResource(adapter.images[pos]);
        name.setText(adapter.names[pos]);

        img.setImageResource(adapter1.images[pos]);
        name.setText(adapter1.names[pos]);
    }
}
