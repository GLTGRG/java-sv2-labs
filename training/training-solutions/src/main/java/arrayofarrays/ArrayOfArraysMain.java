package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] testArray = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        arrayOfArrays.printArrayOfArrays(testArray);
    }
}
