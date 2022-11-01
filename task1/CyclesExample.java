package softserve.task1;

import java.util.Arrays;
import java.util.Scanner;

public class CyclesExample {
    public static void main(String[] args) {
//   Ex1
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n<1) System.out.println("wrong");
//        int sum = 0;
//        for(int i = 1; i < n * 2; i+=2){
//            System.out.println(i);
//            sum +=i;
//        }
//        System.out.println("sum = " + sum);
//-----------------------------------------------

//       Ex2
//        int i = 10;
//          while (i>=10 && i<=50){
//              if(i%3 == 0) {
//                  System.out.println(i);
//              }
//              i++;
//          }
//        for (int i = 10; i>=10 && i<=50; i++){
//            if(i % 3 == 0){
//                System.out.println(i);
//            }
//        }
//--------------------------------------------------------
//
//        Ex3
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        boolean b = true;
//        for(int i = 2; i <= n/2; i++){
//            if(n % i == 0){
//                b = false;
//            }
//        }
//        System.out.println(b);
//--------------------------------------------------

//   Ex4
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        double sum = array[0] + array[1];
        for(int i = 2; i < array.length; i++){
            array[i] = array[i - 1] + array[i - 2];
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("avg: " + sum/ array.length);

    }
}
