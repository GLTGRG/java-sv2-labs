package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i] += i;
        }
    }
    public void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++){
            source[i] += i;
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] number = new int[]{1, 2, 3};
        arrayHandler.addIndexToNumber(number);
        for (int i : number){
            System.out.println(i);
        }

        for (int i : number) {
            System.out.print(i + ", ");
        }

        String[] words = new String[]{"one", "two", "three"};
        for (String i : words){
            System.out.println(i);
        }

        for (String i : words){
            System.out.println(i + ", ");
        }

    }
}