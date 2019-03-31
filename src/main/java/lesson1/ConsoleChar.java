package lesson1;

import java.util.Scanner;

public class ConsoleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character");
        char ch1 = scanner.next().charAt(0);
        int i1 = ch1;
        System.out.println(i1);

        System.out.println("Please enter a number");
        int i2 = scanner.nextInt();
        char ch2 = (char) i2;
        System.out.println(ch2);
    }
}
