package softserve.task4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 7, 25, 50, 35, 75};

        System.out.println(Arrays.stream(arr).filter(p -> p % 2 == 1 && p % 5 == 0).average());
    }
}
