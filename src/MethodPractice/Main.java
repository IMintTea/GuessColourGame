package MethodPractice;

import java.util.Random;

public class Main {

    public static Boolean Replay;
    public static int Score;

    public static float getR(){
        Random rd = new Random();

        float r = rd.nextFloat();

        return r;
    }
    public static float getG(){
        Random rd = new Random();

        float g = rd.nextFloat();

        return g;
    }

    public static float getB(){
        Random rd = new Random();

        float b = rd.nextFloat();

        return b;
    }

    public static void main(String[] args) {
        Replay = new Gui().Replay;
        Score = new Gui().Score;

        while (Replay == true && Score != 20) {
            new Gui();
            Replay = false;
        }

    }

}
