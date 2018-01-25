package com.droidmarvin.floorlite;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.things.pio.Gpio;
import com.google.android.things.pio.PeripheralManagerService;

import java.io.IOException;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private static final String LED_PIN_ONE = "BCM21";
    private static final String LED_PIN_TWO = "BCM20";
    private static final String LED_PIN_THREE = "BCM16";


    private Gpio mLedGioOne, mLedGioTwo, mLedGioThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupLeds();
    }
    // close the LEDs when finished to release resources
    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroyLeds();
    }

    private void setupLeds (){

        PeripheralManagerService service = new PeripheralManagerService();

        try {

            mLedGioOne = service.openGpio(LED_PIN_ONE);
            mLedGioTwo = service.openGpio(LED_PIN_TWO);
            mLedGioThree = service.openGpio(LED_PIN_THREE);

        } catch (IOException e) {

            //bus cannot be opened
        }

    }

    private void destroyLeds(){
        try {
            mLedGioOne.close();
            mLedGioTwo.close();
            mLedGioThree.close();
        } catch (IOException e) {

            //bus cannot be closed
        }
    }

}
