package ru.ncedu.java.tasks;

/**
 * Class for vector
 */
public class ArrayVectorImpl implements ArrayVector {

    /*
    Your class must have a public no-argument constructor that means either the default constructor (the absence of any constructors in your code) or the presence of the following code:
   public ArrayVectorImpl(){ ... }

Your class must not have compilation errors (write your code in IDE).

Instantiation with the no-argument constructor must not fail (it's recommended to test it in main() method).
     */
    private double[] arr;
    private int numOfCoordinates = 0;

    public ArrayVectorImpl() {
        this(0, 0);
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
        double[] newArray = new double[numOfCoordinates];
        System.arraycopy(newArray, 0, arr, 0, numOfCoordinates);
        ArrayVector newVector = new ArrayVectorImpl(newArray);
        return newVector;
    }

    @Override
    public int getSize() {
        return numOfCoordinates;
    }

    @Override
    public void set(int index, double value) {
        if (index > 0) {
            if (index < numOfCoordinates) {
                arr[index] = value;
            } else{
                double[] newArray = new double[index+1];
                System.arraycopy(newArray, 0, arr, 0, numOfCoordinates);
                newArray[index]=value;
                arr=newArray;
                newArray=null;
            }
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return 0;
    }

    @Override
    public double getMax() {
        double tempMax=arr[0];
        for(int i=1;i<numOfCoordinates;i++) {
            if(arr[i]-tempMax>1e-10){
                tempMax=arr[i];
            }
        }
        return tempMax;
    }

    @Override
    public double getMin() {
        double tempMin=arr[0];
        for(int i=1;i<numOfCoordinates;i++) {
            if(tempMin-arr[i]>1e-10){
                tempMin=arr[i];
            }
        }
        return tempMin;
    }

    @Override
    public void sortAscending() {

    }

    @Override
    public void mult(double factor) {

    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        return this;
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
