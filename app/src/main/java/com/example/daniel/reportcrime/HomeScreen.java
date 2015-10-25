package com.example.daniel.reportcrime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;


public class HomeScreen extends AppCompatActivity {

    private Button reportButton;
    private Button viewCrimesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        try {
            Parse.initialize(this, "SBky4g5A1hxY50onQHo2pqkyJN6EGMcXClwRKi98", "TgNEGGF8VnwAUt9qA6OI5XFTJQHKGvfL9EMYPRVS");
            }
        catch(Exception e){
            e.printStackTrace();
        }

        /**Floating Button Setup by default. Might use for something later
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });*/

        //Initialize reportButton
        reportButton = (Button)findViewById(R.id.report_button);
       setupReportButtonListener();
        //Initialize viewCrimeButton
        viewCrimesButton = (Button)findViewById(R.id.view_crime_button);
        setupViewCrimesButtonListener();

    }

    private void setupViewCrimesButtonListener() {
        viewCrimesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, ViewCrimesMapsActivity.class);
                startActivity(i);
            }
        });
    }

    private void setupReportButtonListener() {
        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, ReportMapsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
