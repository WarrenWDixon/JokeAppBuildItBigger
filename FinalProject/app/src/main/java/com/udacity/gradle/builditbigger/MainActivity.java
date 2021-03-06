package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.udacity.gradle.jokes.Joker;
import com.android.example.androidactivitylibrary.JokeActivity;



public class MainActivity extends AppCompatActivity {

    public String retrievedJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("WWD", "calling async task");
        //new EndpointsAsyncTask().execute(new Pair<Context, String>(this, retrievedJoke));
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

    public void tellJoke(View view) {
        //Joker myJoker = new Joker();
        //String myJoke = myJoker.getJoke();
        //Intent intent = new Intent(this, JokeActivity.class);
        //intent.putExtra("jokeString", myJoke);
        //startActivity(intent);

        //
        // Toast.makeText(this,myJoke, Toast.LENGTH_SHORT).show();
        Log.d("WWD", "calling async task");
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Warren"));
    }



}

