package com.aas.the_hungry_developer_resturant_3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);
        Dish[] mainCourse = {
                new Dish("Reshmi Kebab with coleslaw", "Tender reshmi kebab served with a side of crunchy coleslaw", 1999),
                new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new Dish("Doner kebab with curry sauce", "Tender doner kebab served with a side of spicy curry sauce", 1799),
                new Dish("Dory fish and chips", "Crispy dory fish served with golden chips", 1599),
                new Dish("Beef and mushroom pie", "A hearty beef and mushroom pie with a flaky crust", 1899),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new Dish("Cabbage and chickpea salad", "A refreshing salad made with cabbage and chickpeas", 1099),
                new Dish("Rib eye steak with peppercorn sauce", "Juicy rib eye steak served with a rich peppercorn sauce", 2499),
                new Dish("Cucumber and mint salad", "A refreshing salad made with cucumber and fresh mint", 1099),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new Dish("Moroccan lamb tagine", "Slow-cooked Moroccan lamb tagine with apricots and almonds", 2199),
                new Dish("Chicken and mushroom pie", "A classic chicken and mushroom pie with a flaky crust", 1799),
                new Dish("Mashroom and spinach risotto", "Creamy risotto made with mushrooms and fresh spinach", 1599),
                new Dish("Cabbage and chickpea curry", "A hearty curry made with cabbage and chickpeas", 1399),
                new Dish("Lamb and mint kebab", "Tender lamb kebab infused with fresh mint", 1999),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourse);
        mainCoursesList.setAdapter(dishesAdapter);
    }
}
