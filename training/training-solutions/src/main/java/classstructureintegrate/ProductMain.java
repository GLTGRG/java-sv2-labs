package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name!");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the " + name + "!");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        product.increasePrice(150000);
        System.out.println("The price of the " + product.getName() + " " + "has risen to " + product.getPrice());
        product.decreasePrice(100000);
        System.out.println("The price of the " + product.getName() + " " + "has dropped to " + product.getPrice());

    }
}
