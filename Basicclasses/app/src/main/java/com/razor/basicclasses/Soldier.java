package com.razor.basicclasses;

import android.util.Log;

public class Soldier {
    int health;
    String soldierType;
    void shootEnemy() {
        Log.i(soldierType, "is shooting");
    }
}
