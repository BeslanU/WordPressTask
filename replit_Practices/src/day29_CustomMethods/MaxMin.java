package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {

        int[] numbers = {10,8,95,4,76,55,1,10};
        maxMun(numbers);
        minMun(numbers);
    }

    public static void maxMun(int[] arr){

        int max = arr[0];
        for (int each : arr){
            if (each > max){
                max = each;
            }
        }

        System.out.println("maxim number " + max);

    }
    public static void minMun(int[] arr){

        int min = arr[0];
        for (int each : arr){
            if (each < min){
                min = each;
            }
        }

        System.out.println("min number " + min);

    }
}
