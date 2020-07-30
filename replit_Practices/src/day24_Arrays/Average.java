package day24_Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,25,3,3,37,1,1,4,6,5,6,46};
        int sum = 0;

        for (int i = arr.length-1; i >=0; i--){
            sum += arr[i];
        }
        System.out.println(sum);
        double avarage = sum / (double)arr.length;
        System.out.println(avarage);
    }
}
