package day16_String;

public class Check_words {
    public static void main(String[] args) {
        String  str = "i like Java";
        if(str.length() == 0){
            System.out.println("Empty string");
        }else if(str.length() > 3){
            System.out.println(str.substring(str.length() - 3));
        }else {
            System.out.println(str);
        }

        //String result = (str.length() == 0) ? "empty string" : (str.length() > 3) ?
               //  str.substring(str.length() - 3) : str;

    }
}
