package com.visa.android.integration.checkoutsampleapp.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;

import java.io.FileOutputStream;

public class listDrinksActivity extends Activity {

    public static final int VXO = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drinks);
    }

    public void addDrink(View view)
    {


        EditText e1 = (EditText)findViewById(R.id.merchantName);
        EditText e2= (EditText)findViewById(R.id.price);

        String merchant = e1.getText().toString();
        String price =  e2.getText().toString();
        String list = merchant.concat(":");
        String finalList = list.concat(price);




        String filename = "drinkList.txt";
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(finalList.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this, PaymentStartActivity.class);
        intent.putExtra("buttonType", VXO);
        startActivity(intent);




    }
}
