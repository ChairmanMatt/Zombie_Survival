package com.jollyrogerapps.zombieapocalypsesurvival;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void openIntro(View view){
        Intent intro = new Intent(this, IntroActivity.class);
        startActivity(intro);
    }

    public void openEquipment(View view){
        Intent equip = new Intent(this, EquipActivity.class);
        startActivity(equip);
    }

    public void openNewsMedia(View view){
        Intent newsMedia = new Intent(this, NewsMediaActivity.class);
        startActivity(newsMedia);
    }

    public void openHotline(View view){
        Intent hotline = new Intent(this, HotlineActivity.class);
        startActivity(hotline);
    }
}
