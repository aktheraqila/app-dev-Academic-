package com.aas.the_hungry_developer_resturant_3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_starters);

        ListView starterList = findViewById(R.id.list_view_starters);


        Dish[] dishes = {
                new Dish("Mushroom and tofu maki", "A delicious combination of mushrooms and tofu wrapped in sushi rice and seaweed.", 999),
                new Dish("Egg and avocado uramaki", "A delightful uramaki roll filled with creamy avocado and soft-boiled egg.", 899),
                new Dish("Melon and lemon soup", "A refreshing soup made with sweet melon and zesty lemon.", 799),
                new Dish("Coconut and chocolate mousse", "A rich mousse combining the tropical flavor of coconut with decadent chocolate.", 1099),
                new Dish("Spinach and cabbage wontons", "Steamed wontons filled with a savory mix of spinach and cabbage.", 899),
                new Dish("Broccoli and cucumber soup", "A light soup featuring fresh broccoli and crisp cucumber.", 799),
                new Dish("Chilli and aubergine dip", "A spicy dip made with roasted aubergine and chili peppers.", 699),
                new Dish("Chickpea and chilli gyoza", "Pan-fried gyoza filled with chickpeas and a hint of chili.", 899),
                new Dish("Sprout and pineapple soup", "A unique soup blending sprouts with sweet pineapple.", 799),
                new Dish("Egusi and borscht soup", "A hearty soup combining egusi seeds with traditional borscht flavors.", 899),
                new Dish("Aubergine and egg sushi", "Sushi rolls filled with roasted aubergine and soft-boiled egg.", 999),
                new Dish("Artichoke and mustard soup", "A creamy soup featuring artichokes with a touch of mustard.", 899),
                new Dish("Peppercorn and tamarind soup", "A tangy soup made with peppercorns and tamarind paste.", 799),
                new Dish("Parsley and celeriac parcels", "Savory parcels filled with parsley and celeriac, baked to perfection.", 899),
                new Dish("Pasta and broccoli soup", "A comforting soup with pasta pieces and tender broccoli florets.", 799),
                new Dish("Potato and courgette soup", "A creamy blend of potatoes and courgettes in a smooth soup.", 899),
                new Dish("Chickpea and cabbage parcels", "Baked parcels filled with chickpeas and cabbage, seasoned to perfection.", 899),
                new Dish("Coriander and peppercorn gyoza", "Gyoza filled with coriander leaves and peppercorns for a flavorful bite.", 899)
        };



        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        starterList.setAdapter(dishesAdapter);
    }
}