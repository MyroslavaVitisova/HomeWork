package lesson6;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {54,26,93,17,77,31,44,55,20};

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(arr));
    }
}

