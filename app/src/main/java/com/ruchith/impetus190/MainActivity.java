package com.ruchith.impetus190;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button day1,day2;
    TextView eventday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        day1 =(Button)findViewById(R.id.day1);
        day2=(Button)findViewById(R.id.day2);
        eventday=(TextView)findViewById(R.id.events_text);


        listView=(ListView)findViewById(R.id.listview);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display();
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display1();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {

                Intent intent= new Intent(getApplicationContext(),Description.class);
                intent.putExtra("Position",pos);

                startActivity(intent);
            }
        });



    }
    public void display()
    {
        eventday.setText("Day 1 events");
        CustomAdapter adapter= new CustomAdapter(this);
        listView.setAdapter(adapter);
    }

    public void display1()
    {
        eventday.setText("Day 2 events");
        CustomAdapter1 adapter1=new CustomAdapter1(this);
        listView.setAdapter(adapter1);
    }
}
