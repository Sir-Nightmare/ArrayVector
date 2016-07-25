package ru.ncedu.java.tasks;

/**
 * Created by Sir Nightmare on 7/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("Hello World!");
        ArrayVector two = new ArrayVectorImpl(3,2,1,0);
        double[] array1 = two.get();
        ArrayVector one = two.clone();
        for (int i = 0; i < two.getSize(); i++) {
            System.out.print(two.get(i));
            System.out.print(' ');
            }

        System.out.println(' ');
        for (int i = 0; i < one.getSize(); i++) {
            System.out.print(one.get(i));
            System.out.print(' ');
        }

    }
}
