package com.droidmarvin.floorlite;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.things.pio.Gpio;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private static final String LED_PIN_ONE = "BCM21";
    private static final String LED_PIN_TWO = "BCM20";
    private static final String LED_PIN_THREE = "BCM16";


    private Gpio mLedGioOne, mLedGioTwo, mLedGioThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void setupLeds (){

    }

    private void destroyLeds(){

    }

}
