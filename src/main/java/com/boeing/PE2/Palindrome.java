package com.boeing.PE2;
import java.util.Scanner;

public class Palindrome {

    public static String reverseInput(String input){

        /* Create new StringBuilder object to implement the reserve function.*/
        StringBuilder builderInput = new StringBuilder();

        /* append a string into StringBuilder input1 */
        builderInput.append(input);
        builderInput = builderInput.reverse();        // reverse StringBuilder input1.

        /*Convert Builder string to string */
        String reverseInput = builderInput.toString();
        return reverseInput;
    }

    public static String checkPalindrome(String input){

        String palindrome = "";

        /*Call function to reverse the input */
        String reserveInput = reverseInput(input);

        /* Check input is palindrome or not */
        if(input.equals(reserveInput)){
            palindrome = input + " is a palindrome input";
        }else{
            palindrome = input + " is not a palindrome input";
        }
        return palindrome;
    }
    public static void main(String[] args) {

        System.out.println("Kindly enter your input");
        Scanner scan = new Scanner(System.in);

        /* Read the user input in a string*/
        String input = scan.nextLine();

        String palindrome = checkPalindrome(input);
        System.out.println(palindrome);

    }
}
