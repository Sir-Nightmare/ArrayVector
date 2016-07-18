package ru.ncedu.java.tasks;

/**
 * Class for vector
 */
public class ArrayVectorImpl implements ArrayVector
{

    /*
    Your class must have a public no-argument constructor that means either the default constructor (the absence of any constructors in your code) or the presence of the following code:
   public ArrayVectorImpl(){ ... }

Your class must not have compilation errors (write your code in IDE).

Instantiation with the no-argument constructor must not fail (it's recommended to test it in main() method).
     */
    private double[] arr;
    private int numOfCoordinates=0;

    public ArrayVectorImpl() {
        this(0,0);
    }
    public ArrayVectorImpl(double... elements) {
        arr = elements;
        numOfCoordinates = arr.length;
    }

    @Override
    public void set(double... elements) {
        arr = elements;
        numOfCoordinates = arr.length;
    }

    @Override
    public double[] get() {
        return arr;
    }

    @Override
    public ArrayVector clone() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void set(int index, double value) {

    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return 0;
    }

    @Override
    public double getMax() {
        return 0;
    }

    @Override
    public double getMin() {
        return 0;
    }

    @Override
    public void sortAscending() {

    }

    @Override
    public void mult(double factor) {

    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        return null;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        return 0;
    }

    @Override
    public double getNorm() {
        return 0;
    }

}
