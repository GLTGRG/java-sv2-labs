package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[1]);
        System.out.println(days.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] * 2;
        }

        for (int item : numbers) {
            System.out.print(item + "  ");
        }

        System.out.println();

        boolean[] bool0 = new boolean[6];
        for (int i = 1; i < bool0.length; i++) {
            bool0[i] = !bool0[i - 1];
        }

        for (int i = 0; i < bool0.length; i++) {
            System.out.print(bool0[i] + " ");
        }
    }
}

