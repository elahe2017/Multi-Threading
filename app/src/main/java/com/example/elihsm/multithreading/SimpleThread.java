package com.example.elihsm.multithreading;

import android.util.Log;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        Log.i("Thread", "Thread begins,Thread Name=> " + Thread.currentThread().getName());
        try {

        Thread.sleep(3000);
    }catch (InterruptedException e){
            e.printStackTrace();
        }
        Log.i("Thread", "Thread Ends");

    }
}
