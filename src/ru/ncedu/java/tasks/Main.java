package ru.ncedu.java.tasks;

/**
 * Created by Sir Nightmare on 7/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayVector two = new ArrayVectorImpl(4, 3, 2, 1, 6);

        ArrayVector one = new ArrayVectorImpl(1, 1, 1, 1);
        for (int i = 0; i < two.getSize(); i++) {
            System.out.print(two.get(i));
            System.out.print(' ');
        }
        two.set(7,99,12,13);

        System.out.println(' ');
        for (int i = 0; i < two.getSize(); i++) {
            System.out.print(two.get(i));
            System.out.print(' ');
        }
    }
}
