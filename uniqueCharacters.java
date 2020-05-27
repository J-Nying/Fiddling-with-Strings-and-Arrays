/*
"Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?"

A simple program to check if a string has all unique characters.
By https://github.com/J-Nying
*/

import java.io.*;
import javax.swing.*;

public class uniqueCharacters{

   public static void main(String[] args){
   
      String input = JOptionPane.showInputDialog(null, "This program will check if a word has unique characters.\nInput word/sentence here:");
         
      while(input.equals("") || input.trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "No word was entered.");
               input = JOptionPane.showInputDialog(null, "This program will check if a word or sentence unique characters.\nInput word/sentence here:");
      }
           
      if(checkIfUniqueCharacters(input)){
            JOptionPane.showMessageDialog(null, "'" + input +"' has unique characters.");
      }
      
      else{
         
            JOptionPane.showMessageDialog(null, "The word " + input +" has 2 or more of at least 1 character.");
      }
   }


   public static boolean checkIfUniqueCharacters(String wordToCheck){     
      String c = wordToCheck;   
      for(int i=0; i<wordToCheck.length(); i++){ 
         char temp=c.charAt(i);
            for(int j=i+1; j<wordToCheck.length(); j++){       
               if(temp==c.charAt(j) && c.charAt(j)!=' '){
                  return false;
               }
            }
      }
   return true;
   }


}
