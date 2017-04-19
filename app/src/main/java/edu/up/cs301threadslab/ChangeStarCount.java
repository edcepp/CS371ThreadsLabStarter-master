package edu.up.cs301threadslab;

/**
 * Created by eepp on 4/19/17.
 */

// Checkpoint 5
public class ChangeStarCount extends Thread {
    private StarAnimation myStarAnimate = null;

    public ChangeStarCount (StarAnimation animation){
        myStarAnimate = animation;
    }

    @Override
    public void run() {
        super.run();

        while (true) {
            double random = Math.random();
            if (random > 0.5) myStarAnimate.addStar();
            else myStarAnimate.removeStar();

            try {
                Thread.sleep(2); // checkpoint 6 stress test change from 40 to 2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
