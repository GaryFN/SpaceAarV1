package com.gary.soft.spaceaarv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.Garysoft.LostAlpha.UnityPlayerActivity;

public class TransActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);
        Intent i = new Intent(this, UnityPlayerActivity.class);
        startActivity(i);
    }
}
