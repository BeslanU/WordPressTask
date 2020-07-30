package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sumOfOdd = 0;
        /*
        for(int i = 1; i <= 99 ; i +=2){
            sumOfOdd +=i;
        }

         */
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                sumOfOdd = sumOfOdd +i;
            }
        }
        System.out.println(sumOfOdd);

    }
}
