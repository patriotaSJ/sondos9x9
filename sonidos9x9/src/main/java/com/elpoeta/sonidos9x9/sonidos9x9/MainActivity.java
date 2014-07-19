package com.elpoeta.sonidos9x9.sonidos9x9;

import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    ImageButton imgBut1, imgBut2, imgBut3;
    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBut1 = (ImageButton) findViewById(R.id.imageButton);
        imgBut2 = (ImageButton) findViewById(R.id.imageButton2);
        imgBut3 = (ImageButton) findViewById(R.id.imageButton3);





    }


    public void onClickImgButon1(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.buenochao); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickImgButon2(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.carlitoxidea); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickImgButon3(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.chaleco); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }


}
