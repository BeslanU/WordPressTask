import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Project:Temperature Conversion
 */

public class Converter {

    public static void main(String[] args) {
        double fahrenheit, celsius;
        String name, tempInput, conversionType,output;
        String msg = "Welcome to the Temperature conversion program.";
        output = "";
        JOptionPane.showMessageDialog(null,msg,"Welcome",JOptionPane.INFORMATION_MESSAGE);
        name = JOptionPane.showInputDialog(null,"What is your name?","Name",JOptionPane.QUESTION_MESSAGE);
        conversionType = JOptionPane.showInputDialog(null,"Would you like to convert from Fahrenheit to Celsius or Celsius to Fahrenheit?\n\nType1 for " +
                "Fahrenheit to Celsius\nType 2 for Celsius to Fahrenheit");
        if (conversionType.equals("1")){
            tempInput = JOptionPane.showInputDialog(null,"Please input temperature in Fahrenheit: ", "Input", JOptionPane.PLAIN_MESSAGE);
            fahrenheit = Double.parseDouble(tempInput);
            celsius = (fahrenheit - 32)*5/9;

            output = Math.round(fahrenheit) + " degrees fahrenheit is " + new DecimalFormat("#.##").format(celsius) + " degrees celsius.";
            JOptionPane.showMessageDialog(null,output);
        }else if(conversionType.equals("2")){
            tempInput = JOptionPane.showInputDialog(null,"Please input temperature in Celsius: ", "Input", JOptionPane.PLAIN_MESSAGE);
            celsius = Double.parseDouble(tempInput);
            fahrenheit = celsius * 9/5.
                    +32;

            output = Math.round(celsius) + " degrees fahrenheit is " + new DecimalFormat("#.##").format(fahrenheit) + " degrees celsius.";

        }else {
            output = "Oops,that's not on of the options";
        }
        JOptionPane.showMessageDialog(null,output);

    }
}
