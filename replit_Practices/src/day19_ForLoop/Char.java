package day19_ForLoop;

public class Char {
    public static void main(String[] args) {
        for(char ch = 'a'; ch <= 'z'; ch ++){
            System.out.print(ch);
        }
        System.out.println();
        for(int i =65;i <= 90;i++){
            System.out.print((char) i+" ");
        }
        System.out.println();
        for(char ch = 'Z'; ch >= 'A'; ch--){

            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i =90; i >= 65; i--){
            System.out.print((char)i + " ");
        }
    }
}
