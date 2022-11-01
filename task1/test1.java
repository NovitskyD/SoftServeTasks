package softserve.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        if(Math.abs(scanner.nextInt())%10 == 3){
//            System.out.println("%3");
//        }
//        else System.out.println("!%3");


//        EX2
//
//        Scanner scanner2 = new Scanner(System.in);
//        int a = scanner2.nextInt();
//        if(a >-1 && a < 11){
//            if(a == 0 || a > 4 && a < 11){
//                System.out.println(a + " гривень");
//            }
//            else if (a > 1 && a < 5){
//                System.out.println(a + " гривні");
//            }
//            else System.out.println(a + " гривня");
//        }
//        else System.out.println("Wrong");


//        Ex3

//        System.out.println("a = ");
//        Scanner scanner3 = new Scanner(System.in);
//        double a, b, c;
//        a = scanner3.nextDouble();
//        System.out.println("b = ");
//        b = scanner3.nextDouble();
//        System.out.println("c = ");
//        c = scanner3.nextDouble();
//        double d = b * b - 4 * a * c;
//        System.out.println("D = " + d);
//        if(d > 0){
//            double x1 = (-b + Math.sqrt(d)) / (2 * a);
//            double x2 = (-b - Math.sqrt(d)) / (2 * a);
//            System.out.printf("x1 = %f , x2 = %f", x1, x2);
//        }
//        else if(d == 0){
//            double x = -b / (2 * a);
//            System.out.println("Единственный корень = " + x);
//        }
//        else System.out.println("Нет действительных корней");

        Map<Character, Integer> map = new HashMap<>();
        String s = "aaaa dassweertgfd";
        /*for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.compute(ch, (k, v) -> (v==null) ? 1 : ++v);
        }*/
        for(char ch: s.toCharArray()){
            map.compute(ch, (k, v) -> (v==null) ? 1 : ++v);;
        }
        System.out.println(map);



    }
}
