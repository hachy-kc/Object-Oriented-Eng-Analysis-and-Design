/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

import java.util.Arrays;
/**
 *
 * @author hndu
 */
public class AnagramChecker {
    //Requires: <requires two strings "str1" and "str2" that are not null>
    //Modifies: <modifies both strings making all characters in them lower case and removes all spaces found in the strings>
    //Effects: <returns true if the strings are anagrams and false otherwise>
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        String newStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String newStr2 = str2.replaceAll("\\s", "").toLowerCase();
        char[] chars1 = newStr1.toCharArray();
        char[] chars2 = newStr2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        return Arrays.equals(chars1, chars2);
    }
    
    public static void main(String[] args) {
         if (args.length == 2) {
            String str1 = args[0];
            String str2 = args[1];
            boolean result = areAnagrams(str1, str2);
            System.out.println("Anagrams Checker Output for '" + str1 + "' and '" + str2 + "': " + result);
        } 
    }
}
// use    application.args="listen" "silent"    for copy pasta when demo-ing
// use    application.args="Hello" "World"    for copy pasta when demo-ing
// use    application.args="Dormitory" "Dirty room"    for copy pasta when demo-ing
