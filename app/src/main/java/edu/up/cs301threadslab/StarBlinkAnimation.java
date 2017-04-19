package edu.up.cs301threadslab;


/**
 * Created by eepp on 4/18/17.
 */

// Checkpoint 3
public class StarBlinkAnimation extends Thread {
    private AnimationView myView = null;

    public StarBlinkAnimation (AnimationView view) {
        myView = view;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1);  //checkpoint 6 change from 50 to 1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myView.postInvalidate();
        }
    }
}
