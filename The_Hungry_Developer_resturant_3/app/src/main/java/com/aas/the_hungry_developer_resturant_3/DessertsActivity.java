package com.aas.the_hungry_developer_resturant_3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);
        Dish[] desserts = {
                new Dish("Chocolate lava cake", "A rich chocolate cake with a molten chocolate center", 1299),
                new Dish("Vanilla panna cotta", "Creamy vanilla panna cotta served with berry compote", 999),
                new Dish("Lemon tart", "Tangy lemon tart with a buttery crust", 899),
                new Dish("Fruit salad", "A refreshing mix of seasonal fruits", 699),
                new Dish("Cheesecake", "Classic cheesecake with a graham cracker crust", 1099),
                new Dish("Tiramisu", "Italian coffee-flavored dessert with layers of mascarpone cheese", 1199),
                new Dish("Apple pie", "Warm apple pie served with vanilla ice cream", 999),
                new Dish("Brownie sundae", "Fudgy brownie topped with ice cream and chocolate sauce", 1099),
                new Dish("Mango mousse", "Light and airy mango mousse with a hint of lime", 899),
                new Dish("Pistachio kulfi", "Traditional Indian pistachio ice cream", 799),
                new Dish("Caramel flan", "Creamy caramel flan with a rich caramel sauce", 899),
                new Dish("Chocolate chip cookies", "Freshly baked chocolate chip cookies", 699),
                new Dish("Banoffee pie", "A delicious pie with bananas, toffee, and whipped cream", 1099),
                new Dish("Raspberry sorbet", "Refreshing raspberry sorbet with a tart finish", 799),
                new Dish("Coconut macaroons", "Chewy coconut macaroons dipped in chocolate", 699),
                new Dish("Strawberry shortcake", "Layers of sponge cake with fresh strawberries and whipped cream", 999),
                new Dish("Peach cobbler", "Warm peach cobbler served with vanilla ice cream", 899),
                new Dish("Chocolate mousse", "Rich and creamy chocolate mousse topped with whipped cream", 999),
                new Dish("Almond biscotti", "Crispy almond biscotti perfect for dipping in coffee", 699),
                new Dish("Crème Brûlée", "Classic French dessert with a caramelized sugar crust", 1199),
                new Dish("Lemon meringue pie", "Tangy lemon filling topped with fluffy meringue", 1099)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dishesAdapter);

    }
}