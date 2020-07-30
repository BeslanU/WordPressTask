package day26_MultyDimensionalArray;
import java.util.Arrays;
public class SortDesending {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] desc = new int[arr.length];
        /*desc[0] = arr[arr.length-1];
        desc[1] = arr[1];
        desc[desc.length-1] = arr[0];
         */
        int k = arr.length-1;
        for (int i = 0; i <= desc.length-1; i++){
            desc[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(desc));

    }
}
