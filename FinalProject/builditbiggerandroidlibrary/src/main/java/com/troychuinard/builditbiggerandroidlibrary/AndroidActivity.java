package com.troychuinard.builditbiggerandroidlibrary;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class AndroidActivity extends AppCompatActivity {

    private static final String RANDOM_JOKE = "RANDOM_JOKE";
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_library);

        //TODO: When I didn't use the support action bar, I was getting a nullPointer. Should I always use support library? How can I ensure I do not make this mistake again?
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        Intent i = getIntent();


        mTextView = findViewById(R.id.random_joke);
        String x = i.getStringExtra(RANDOM_JOKE);
        mTextView.setText(x);


    }

    //TODO: Is it alright to have code/methods prior to the super?
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}
