package math.math;

import java.util.Random;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(1,5));
        System.out.println(Math.min(1,5));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(12.43));
        System.out.println(Math.abs(-5));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(3,6));
        System.out.println(Math.subtractExact(6,3));
        System.out.println(Math.multiplyExact(2,6));
        System.out.println(Math.pow(1.5,2.6));
        System.out.println(Math.incrementExact(3));
        System.out.println(Math.decrementExact(3));
        System.out.println(Math.random());

    }
}