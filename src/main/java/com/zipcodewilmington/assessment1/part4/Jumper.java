package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int jumps = flagHeight/jumpHeight + flagHeight%jumpHeight;
        return jumps;
    }
}
