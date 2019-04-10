package lessson4;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            list.add(scanner.nextInt());
        }

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }

            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println("Min value is - " + min);
        System.out.println("Max value is - " + max);
    }
}
