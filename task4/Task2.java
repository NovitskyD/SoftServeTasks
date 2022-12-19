package softserve.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void uniqueRows(String str){
        String[] strings = str.split("\n");
        ArrayList<String> arrayList = new ArrayList<>();
        Arrays.stream(strings).filter(s -> s.length() > 28)
                .forEach(s -> {
                    if(!arrayList.contains(s))
                        arrayList.add(s);
                });
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        String str = """
                Ні долі, ні волі у мене нема,
                Зосталася тільки надія одна:
                Надія вернутись ще раз на Вкраїну,
                Поглянути ще раз на рідну країну,
                Поглянути ще раз на синій Дніпро, –
                Там жити чи вмерти, мені все одно;
                Поглянути ще раз на степ, могилки,
                Востаннє згадати палкії гадки…
                Ні долі, ні волі у мене нема,
                Зосталася тільки надія одна.         
                """;
        System.out.println(str.length());
    }
}
