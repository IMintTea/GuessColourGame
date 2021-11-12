package MethodPractice;

import java.util.Random;

public class Main {


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
        new Gui();
    }

}
