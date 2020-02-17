/*
"String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
'compressed' string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z)."

By Jekainden
*/

import java.io.*;
import java.util.*;
import javax.swing.*;



public class compressString{

   public static void main(String[] args){
      
      String input = JOptionPane.showInputDialog(null, "Enter here:");
      String s = compressedString(input);
      if(s.length()<input.length()){
         JOptionPane.showMessageDialog(null, "Original input: " + input + "\nHere's the compressed version: " + s);
      }
      
      else{
         JOptionPane.showMessageDialog(null, "Original input: " + input + "\nThe compressed version (" + s + ") would be longer." );
      }

   
   }
   
   public static String compressedString(String str){
      int count = 0;
      String finalString = "";
   
      for (int i=0; i<str.length(); i++){
         count++;
         
         if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1)){
            finalString = finalString + str.charAt(i) + count;
            count = 0;
         }
                  
         else if(i==str.length()-1){
            finalString = finalString + str.charAt(i) + count;         
         }
                          
      }
      
      return finalString;  
   }


}