package day10_ifStatement;

import javax.crypto.spec.PSource;

public class Caracter_identetify {

    public static void main(String[] args) {

        char character = '@';
        boolean isAlpfabet = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

        boolean isDigit = (character >= 48 && character <= 57);

        boolean specialChar = !isAlpfabet && !isDigit;


        if(isAlpfabet){
            System.out.println(character + " is character" );
        }
        else {

            System.out.println(character + " is not a character");

            }

        String digit = "";

        if(isDigit == true){

            digit = character + " digit";
        }else {

            digit = character + " is not digit";

        }
        System.out.println(digit);

        String specialChara = "";

        if(specialChar == true){

            specialChara = character + " is special char";

        }else {

            specialChara = character + " is not char";
        }

        System.out.println(specialChara);

    }

}
