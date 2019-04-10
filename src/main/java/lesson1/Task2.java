package lessson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner( System.in );
        for (int i = 1; i<5; i++) {
            System.out.println("Give me integer" +i + ":");
            numbers.add(scanner.nextInt());
        }


        int answer = Math.max( Math.max(numbers.get(0), numbers.get(1)), Math.max(numbers.get(2), numbers.get(3)));
        System.out.println(answer);

        int countMax = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == answer) {
                countMax++;
            }
        }
        System.out.println(countMax);
    }
}
