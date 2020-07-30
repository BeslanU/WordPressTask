package day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3,8,4,9,7,5,6};


        int[] n1 = {10,20,20,30,40,40,50,60,60,70,80,90,100,10};
        uniqueElements(n1);

    }

    public static void uniqueElements(int[]arr){

        for (int element : arr){
            int count = 0;
            for (int b : arr){
                if(element == b){
                    count++;
                }
            }
            if (count ==1){
                System.out.print(element+ " ");
            }
        }
        System.out.println();
    }
}
