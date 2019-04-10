package lessson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int answer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println(answer);




    }
}
