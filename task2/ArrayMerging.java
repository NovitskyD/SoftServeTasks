package softserve.task2;

import java.util.Arrays;

public class ArrayMerging {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
            index++;
        }
        for(int i = 0; i < arr2.length; i++){
            arr3[index++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
