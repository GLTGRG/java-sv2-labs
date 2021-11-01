package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; i++){
                multiplicationTable[i][j] = (i + 1)*(j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


}
