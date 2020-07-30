package day19_ForLoop;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "tenet";
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
        reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(str.equals(reverse));
    }
}
