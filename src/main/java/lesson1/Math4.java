package lesson1;

import java.util.Scanner;

public class Math4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your number:");
    int i = scanner.nextInt();
    int a = i / 100;
    int b = (i % 100) / 10;
    int c = i % 10;
    System.out.println(a + b + c);
  }
}
