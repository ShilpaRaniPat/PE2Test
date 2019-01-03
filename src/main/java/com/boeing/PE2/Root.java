package com.boeing.PE2;

import java.util.Scanner;

public class Root {

    public static boolean isNumber(String input){
        boolean isNumber = input.matches("-?\\d+(\\.\\d+)?");
        return isNumber;
    }

    public static boolean powerOf(int input){
        if (input == 0)
            return false;
        while (input != 1) {
            if (input % 4 != 0)
                return false;
            input = input / 4;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean isPowerOf = false;
        System.out.println("Kindly enter your input");
        Scanner scan = new Scanner(System.in);

        /* Read the user input in a string*/
        String input = scan.nextLine();

        boolean isNumber = isNumber(input);
        if(isNumber){
            int inputInt = 0 ;
            inputInt =  Integer.parseInt(input);
            isPowerOf = powerOf(inputInt);
        }else{
            isPowerOf = false;
        }
        if(isPowerOf){
            System.out.println(input + " is power of 4");
        }else{
            System.out.println(input + " is not power of 4");
        }
    }
}
