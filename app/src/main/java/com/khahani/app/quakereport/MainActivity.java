package com.khahani.app.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> data = new ArrayList<>();
        data.add(new Earthquake("Teharn",  2.5f));
        data.add(new Earthquake("Sistan baluc",  5.5f));
        data.add(new Earthquake("Azarb",  3f));

        listView = (ListView)findViewById(R.id.listview);

        EathquakeAdapter adapter = new EathquakeAdapter(this, data);

        listView.setAdapter(adapter);


    }
}
