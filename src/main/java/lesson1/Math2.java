package lesson1;

import java.util.Scanner;

public class Math2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your number:");
    int i = scanner.nextInt();
    int sum = i % 10 + i / 10;
    System.out.println(sum);
  }
}
