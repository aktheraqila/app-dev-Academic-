package com.aas.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] thingstoDo = {
                new BucketListEntry("Climb Mt Kilimanjaro", "Do it difficult way", R.drawable.kilimanjaro,4.5f),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle,probably Norway ", R.drawable.northern_lights,5),
                new BucketListEntry("Road Trip Across USA", "Hire a car from West Cost, and travel to the east coast", R.drawable.road_trip,3),
                new BucketListEntry("Scuba Dive", "In Koh Tao, thailand", R.drawable.scubadive,3.7f),
                new BucketListEntry("Skydive", "Preferbly over somewhere with an amazing view", R.drawable.skydive,4.8f)

        };

        RecyclerView recyclerView = findViewById(R.id. recycler_view__things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingstoDo);
        recyclerView.setAdapter(adapter);
    }
}