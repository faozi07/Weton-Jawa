package com.nextwin.weton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Weton dan Neptu Anda");
        }

    }



    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
