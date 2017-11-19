package com.gary.soft.spaceaarv1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Trace;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.Garysoft.LostAlpha.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button ingresar,salir,acercade;
    MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar = (Button) findViewById(R.id.button);
        salir = (Button) findViewById(R.id.salir);
        reproductor=MediaPlayer.create(this,R.raw.mfondo2);
        acercade = (Button) findViewById(R.id.Acercade);
        ingresar.setOnClickListener(this);
        salir.setOnClickListener(this);
        acercade.setOnClickListener(this);
        reproductor.setLooping(true);
        reproductor.start();
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(this, TransActivity.class);
                startActivity(i);
                break;
            case R.id.salir:
                finish();
                break;

            case R.id.Acercade:
                Intent ii = new Intent(this, ContacActivity.class);
                startActivity(ii);
                break;

        }

    }

    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        if (reproductor.isPlaying()){
            reproductor.stop();
            reproductor.release();
        }
    }
    @Override
    protected void  onResume(){
        super.onResume();
        reproductor.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        reproductor.pause();
    }
}
