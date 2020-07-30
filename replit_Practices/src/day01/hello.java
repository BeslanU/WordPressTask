package day01;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        System.out.println("Enter status code:");

        Scanner scan = new Scanner(System.in);
        int variable = scan.nextInt();
        if(variable ==200){
            System.out.println("OK");
        }else if(variable ==201){
            System.out.println("Created");
        }else if(variable ==202) {
            System.out.println("Accepted");
        }else if(variable ==301) {
            System.out.println("Moved Permanently");
        }else if(variable ==303) {
            System.out.println("See Other");
        }else if(variable ==304) {
            System.out.println("Not Modified");
        }else if(variable ==307) {
            System.out.println("Temporary Redirect");
        }else if(variable ==400) {
            System.out.println("Bad Request");
        }else if(variable ==401) {
            System.out.println("Unauthorized");
        }else if(variable ==403) {
            System.out.println("Forbidden");
        }else if(variable ==404) {
            System.out.println("Not Found");
        }else if(variable ==410) {
            System.out.println("Gone");
        }else if(variable ==500) {
            System.out.println("Internal Server Error");
        }else if(variable ==503) {
            System.out.println("Service Unavailable");
        }else {
            System.out.println("Invalid status code!");
        }


    }













}