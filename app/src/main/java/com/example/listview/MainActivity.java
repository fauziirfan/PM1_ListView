package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mendapatkan ListView dari layout
        ListView listView = findViewById(R.id.listView);

        // Mengambil data string array dari resources
        String[] items = getResources().getStringArray(R.array.items_array);

        // Membuat adapter untuk ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        // Menghubungkan adapter ke ListView
        listView.setAdapter(adapter);
    }
}
