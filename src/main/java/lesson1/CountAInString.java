package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountAInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char [] array = line.toCharArray();
        int count = 0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'а') {
                count++;
                indexes.add(i);
             }
        }
        System.out.println("Кол-во символов \"а\" " + count + " индексы символа \"а\" " + "в строке - " + indexes);
    }
}
