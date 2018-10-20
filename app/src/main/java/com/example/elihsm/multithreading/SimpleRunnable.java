package com.example.elihsm.multithreading;

import android.util.Log;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        Log.i("Runnable", "Runnable begins,Thread Name=> " + Thread.currentThread().getName());
        try {

            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Log.i("Runnable", "Runnable Ends");


    }
}
