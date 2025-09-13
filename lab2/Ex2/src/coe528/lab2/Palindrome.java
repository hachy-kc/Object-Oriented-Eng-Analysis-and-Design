/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

/**
 *
 * @author hndu
 */
public class Palindrome {
    //Requires: <requires a string called "a" that is not empty or null>
    //Modifies: <modifies string "a" to make all characters lower case>
    //Effects: <returns true if the specified string is a palindrome and false otherwise>
        public static boolean isPalindrome(String a) {
            //write the code for isPalindrome
            if (a == null || a.isEmpty()){
                return false;
            }
            
            String newstring = a.toLowerCase();
            
            if (newstring.equals(new StringBuilder(newstring).reverse().toString())){
                return true;
            }
            
            return false;
    }

public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2"))
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3"))
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }   
}
// use    application.args=1    for copy pasta when demo-ing
// use    application.args=2    for copy pasta when demo-ing
// use    application.args=3    for copy pasta when demo-ing
// use    application.args=4    for copy pasta when demo-ing