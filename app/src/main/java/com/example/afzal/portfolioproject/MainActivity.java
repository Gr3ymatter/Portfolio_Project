package com.example.afzal.portfolioproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotify_click(View view){

        Toast.makeText(this, "This Button Will Launch My Spotify App",Toast.LENGTH_SHORT).show();

    }

    public void scores_click(View view){

        Toast.makeText(this, "This Button Will Launch My Scores App",Toast.LENGTH_SHORT).show();

    }


    public void library_click(View view){

        Toast.makeText(this, "This Button Will Launch My Library App",Toast.LENGTH_SHORT).show();

    }

    public void bigger_click(View view){

        Toast.makeText(this, "This Button Will Launch My Build It Bigger App",Toast.LENGTH_SHORT).show();

    }

    public void xyz_click(View view){

        Toast.makeText(this, "This Button Will Launch My XYZ Reader App",Toast.LENGTH_SHORT).show();

    }

    public void capstone_click(View view){

        Toast.makeText(this, "This Button Will Launch My Capstone Project App",Toast.LENGTH_SHORT).show();

    }





}
