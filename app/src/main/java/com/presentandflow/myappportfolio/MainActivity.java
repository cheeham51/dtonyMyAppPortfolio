package com.presentandflow.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {

        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void popularMovieButton(View view) {
        // Do something in response to button click

        String msg = "This button will launch my Popular Movie app!";
        displayToast(msg);

    }

    public void stockHawkButton(View view) {
        // Do something in response to button click
        String msg = "This button will launch my Stock Hawk app!";
        displayToast(msg);
    }

    public void buildItBiggerButton(View view) {
        // Do something in response to button click
        String msg = "This button will launch my Build It Bigger app!";
        displayToast(msg);
    }

    public void makeYourAppMaterialButton(View view) {
        // Do something in response to button click
        String msg = "This button will launch my Make Your App Material app!";
        displayToast(msg);
    }

    public void goUbiquitousButton(View view) {
        // Do something in response to button click
        String msg = "This button will launch my GoUbiquitous app!";
        displayToast(msg);
    }

    public void capStoneButton(View view) {
        // Do something in response to button click
        String msg = "This button will launch my Capstone app!";
        displayToast(msg);
    }
}
