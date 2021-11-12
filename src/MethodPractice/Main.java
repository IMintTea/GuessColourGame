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
            //Replay = false;
            //new Gui();
//            String b1 = Button1.toString();
//            char b1char = b1.charAt(7);
//            int b1num = Integer.parseInt(String.valueOf(b1char));
        }

    }

}
