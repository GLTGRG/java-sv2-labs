package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a){
        for (int i[] : a){
            for (int j : i){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
