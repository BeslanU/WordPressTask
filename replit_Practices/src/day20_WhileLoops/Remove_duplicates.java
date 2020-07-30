package day20_WhileLoops;

public class Remove_duplicates {
    public static void main(String[] args) {
        String str = "aabb";
        String result = "";
        for (int i = 0; i <= str.length()-1; i++){
            String s = "" + str.charAt(i);
            if (!result.contains(s)){
                result += s;
            }


        }
        System.out.println(result);

    }
}
