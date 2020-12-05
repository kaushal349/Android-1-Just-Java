package com.slayer.justjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    int price = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        int total = calculatePrice();
        displayPrice(total);
    }

    public int calculatePrice(){
        int totalPrice = quantity*price;
        return totalPrice;
    }

    private void displayPrice(int totalPrice){
        TextView priceView = (TextView) findViewById(R.id.price_text_view);
        priceView.setText("$"+totalPrice);
    }

    public void increment(View view){
        if(quantity==100){
            return;
        }
        quantity = quantity + 1;
        displayQuantity();
    }

    public void decrement(View view){
        if(quantity==0){
            return;
        }
        quantity-=1;
        displayQuantity();
    }

    private void displayQuantity(){
        TextView updateQuantity = (TextView) findViewById(R.id.quantity_text_view);
        updateQuantity.setText(""+quantity);
    }
}