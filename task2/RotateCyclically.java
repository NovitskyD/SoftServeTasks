package softserve.task2;

import java.util.Arrays;

public class RotateCyclically {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));

    }
}
