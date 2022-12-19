package softserve.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 2, 1};
        System.out.println(Arrays.toString(arr));

        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(arr)
                .forEach(x -> stringBuilder.append(Integer.toString(x)));
        System.out.println(stringBuilder);
    }
}
