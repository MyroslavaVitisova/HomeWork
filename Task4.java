package lessson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)){
            System.out.println("Names is equals");
        }
        else {
            System.out.println("Names isn't equals");
        }
    }
}
