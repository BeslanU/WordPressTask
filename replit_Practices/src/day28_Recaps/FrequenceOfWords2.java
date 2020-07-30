package day28_Recaps;

public class FrequenceOfWords2 {
    public static void main(String[] args) {
        String str = "pythonpythonpython";
        int count = 0;
        for (int i = 0; i <= str.length()-6; i ++) {
            if(str.substring(i, i+6).equalsIgnoreCase("python")){
                count++;
            }
        }
        System.out.println(count);
    }
}
