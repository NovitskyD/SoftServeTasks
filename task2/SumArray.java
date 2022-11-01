package softserve.task2;

public class SumArray {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int min = values[0];
        int max = values[0];
        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;
        for(int i = 1; i < values.length; i++){
            if(min > values[i]){
                min = values[i];
                indexMin = i;
            }
            if(max < values[i]){
                max = values[i];
                indexMax = i;
            }
        }
        if(indexMin > indexMax){
            for(int i = indexMax + 1; i < indexMin; i++){
                sum += values[i];
            }
        }
        else {
            for (int i = indexMin + 1; i < indexMax; i++){
                sum += values[i];
            }
        }

        System.out.println("max index: " + indexMax + "\n" + "min index: " + indexMin + "\n" +
                sum);
    }
}
