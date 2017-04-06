package com.prog.orient.screen.demo.screen_orient_program;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            Toast.makeText(MainActivity.this, "Portrait Mode", Toast.LENGTH_LONG).show();
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast.makeText(MainActivity.this, "Landscape Mode", Toast.LENGTH_LONG).show();
        }
    }
}
