/*
"URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: 'Mr 3ohn Smith'
Output: 'Mr%203ohn%20Smith' "

A simple Java program that adds '%20' in each space in a string.
By Jekainden
*/

import java.io.*;
import java.util.*;
import javax.swing.*;


public class URLify{

   public static void main (String[] args){
   
   String input = JOptionPane.showInputDialog(null, "Enter a string here:");
   
   JOptionPane.showMessageDialog(null, "Here is the new string:\n" + addPercent20(input));
   
   }



   public static String addPercent20(String a){
     
     String s = "";        
     for(int i = 0; i<a.length(); i++){
      if (a.charAt(i)==' '){
         s = s + "%20";
      }
      
      else{
         s = s + a.charAt(i);
      }
     
     }
     return s;
        
   }


}