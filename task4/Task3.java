package softserve.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaaaaaaaa" , 1);
        map.put("bbbbb" , 1);
        map.put("ccc" , 1);
        map.put("ddddddddddd" , 1);
        map.put("ee" , 1);

        int sum = map.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .flatMapToInt(x -> IntStream.of(x.getValue()))
                .sum();
        System.out.println(sum);
    }
}
