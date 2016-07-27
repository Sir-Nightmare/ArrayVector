package ru.ncedu.java.tasks;

        import java.util.Arrays;

        import static java.lang.Math.sqrt;

/**
 * Class for vector
 */
public class ArrayVectorImpl implements ArrayVector {


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
        return new ArrayVectorImpl(newArray);
    }

    @Override
    public int getSize() {

        return numOfCoordinates;
    }

    @Override
    public void set(int index, double value) {
        if (index >= 0) {
            if (index < numOfCoordinates) {
                arr[index] = value;
            } else {
                double[] newArray = new double[index + 1];
                System.arraycopy(arr, 0, newArray, 0, numOfCoordinates);
                newArray[index] = value;
                arr = newArray;
                newArray = null;
                numOfCoordinates=arr.length;
            }
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return arr[index];
    }

    @Override
    public double getMax() {
        double tempMax = arr[0];
        for (int i = 0; i < numOfCoordinates; i++) {
            if (arr[i] - tempMax > 1e-10) {
                tempMax = arr[i];
            }
        }
        return tempMax;
    }

    @Override
    public double getMin() {
        double tempMin = arr[0];
        for (int i = 0; i < numOfCoordinates; i++) {
            if (tempMin - arr[i] > 1e-10) {
                tempMin = arr[i];
            }
        }
        return tempMin;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(arr);
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < numOfCoordinates; i++) {
            arr[i] *= factor;
        }
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        for (int i = 0; i < numOfCoordinates && i < anotherVector.getSize(); i++) {
            arr[i] += anotherVector.get(i);
        }

        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double scalarMultResult = 0;
        for (int i = 0; i < numOfCoordinates && i < anotherVector.getSize(); i++) {
            scalarMultResult += arr[i] * anotherVector.get(i);
        }

        return scalarMultResult;
    }

    @Override
    public double getNorm() {
        return sqrt(scalarMult(this));
    }

}
