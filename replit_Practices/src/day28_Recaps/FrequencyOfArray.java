package day28_Recaps;

public class FrequencyOfArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "C#","Python","Java"};
        String word = "Java";
        int count = 0;
        for (String each : arr){
            if (word.equalsIgnoreCase(each)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
