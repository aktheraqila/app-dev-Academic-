package com.aas.bucketlist;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam", "Con Dao Islands, Hanoi, Halong Bay, Hoi An, Lang Co", R.drawable.vietnam,4),
                new BucketListEntry("Kerala", "Try varied tea flavours, stay in housevoat, the fabulous food!", R.drawable.kerala,3.5f),
                new BucketListEntry("Japan", "Hot Springs, Shushi, Bamboo Forest, Bullet train through mountains", R.drawable.japan,4),
                new BucketListEntry("Iceland", "Dyjandi Waterfall, nature reserve, maybe the Northern lights too!", R.drawable.iceland,4.7f),
                new BucketListEntry("The amazzon, Brazil", "Try to survive being scared by all the creepy crawlies!", R.drawable.amazon,3.8f)

        };

        RecyclerView recyclerView = findViewById(R.id. recycler_view__places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}