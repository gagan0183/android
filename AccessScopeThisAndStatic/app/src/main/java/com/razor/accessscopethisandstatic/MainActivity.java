package com.razor.accessscopethisandstatic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlienShip girlShip = new AlienShip();
        AlienShip boyShip = new AlienShip();
        Log.i("numShips: ", "" + AlienShip.getNumShips());
        girlShip.shipName = "Corrine";
        boyShip.shipName = "Andees";
        Log.i("girl shields: ", "" + girlShip.getShieldStrength());
        Log.i("boy shields", "" + boyShip.getShieldStrength());

        girlShip.hitDetected();
        Log.i("girl shields: ", "" + girlShip.getShieldStrength());
        Log.i("boy shields", "" + boyShip.getShieldStrength());
        boyShip.hitDetected();
        boyShip.hitDetected();
        boyShip.hitDetected();
        Log.i("girl shields: ", "" + girlShip.getShieldStrength());
        Log.i("boy shields", "" + boyShip.getShieldStrength());
    }
}