package com.visa.android.integration.checkoutsampleapp.app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;


public class FirstScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void goToNext(View view)
    {
        Intent intent = new Intent(this,listDrinksActivity.class);
       // Intent intent = new Intent(this,com.google.android.gms.samples.vision.barcodereader.MainActivity.class);

        startActivity(intent);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Intent intent = new Intent(this,listDrinksActivity.class);
        startActivity(intent);

    }
}
