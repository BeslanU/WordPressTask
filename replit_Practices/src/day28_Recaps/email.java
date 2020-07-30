package day28_Recaps;

public class email {
    public static void main(String[] args) {
        String  email = "cybertek@gmail.com";
        String name = email.substring(0, email.indexOf("@"));
        String domian = email.substring(email.indexOf("@")+1,email.indexOf(".") );
        System.out.println(name);
        System.out.println(domian);


    }
}
