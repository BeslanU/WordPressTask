package day13_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browser = "chrome";
        switch(browser){
            case "chrome":
                System.out.println("Opening Chrome Browser");


            case "firefox":
                System.out.println("Opening Firefox Browser");


            case "opera":
                System.out.println("Opening Opera Browser");


            case "safari":
                System.out.println("Opening safari browser");

            case "edge":
                System.out.println("Opening edge browser");


            default:
                System.out.println("Invalid Browser Name");

        }
    }

}
