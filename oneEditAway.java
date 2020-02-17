/* 
"There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
paie, pie - > true
pales, pale - > true
pale, bale - > true
pale, bake - > false"

By Jekainden
*/

import java.io.*;
import java.util.*;
import javax.swing.*;



public class oneEditAway{


   public static void main (String[] args){
   
      String input1 = JOptionPane.showInputDialog(null, "This program will check if a word is one edit or zero edits away from another.\nEnter first word here:");
      String input2 = JOptionPane.showInputDialog(null, "First word: " + input1 + "\n\n" + "Enter second word here:");
      
      if(input1.equals("") || input1.trim().isEmpty() || input2.equals("") || input2.trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "No word was entered.");
      }
      
      else if (input1.length()-input2.length()>1 || input2.length()-input1.length()>1){
         printFalseMessage(input1, input2);         
      }
      
      else if(input1.length()==input2.length()){
         if(checkReplace(input1, input2)){
            printTrueMessage(input1, input2);         
         }
         else{
            printFalseMessage(input1, input2);         
         }
         
      }
      
      else if(checkInsertRemove(input1, input2)){
         printTrueMessage(input1, input2);         
      }
      
      else{
         printFalseMessage(input1, input2);
      }
   
   }

   
   public static boolean checkReplace(String str1, String str2){
      
      int count=0;
      
      for (int i=0; i<str1.length(); i++){
         if(str1.charAt(i)!=str2.charAt(i)){
            count++;
         }
      }
      return count<=1;
   }


   
   public static boolean checkInsertRemove(String str1, String str2){
   
      int index1=0;
      int index2=0;
      int count=0;
         
      if (str1.length()<str2.length()){
         String temp=str1;
         str1=str2;
         str2=temp;
      }

      while(index1<str2.length()){
      
         if(str1.charAt(index1)==str2.charAt(index2)){
            index1++;
            index2++;
         }
         
         else{
            index1++;
            count++;
         }
         
         
      }
   

      return count<=1;
   }
   
   public static void printTrueMessage(String a, String b){
      JOptionPane.showMessageDialog(null, "'" + a + "' is one or zero edits away from '" + b +"'.\nTrue.");   
   }
   
   public static void printFalseMessage(String a, String b){
      JOptionPane.showMessageDialog(null, "'" + a + "' is more than one edit away from '" + b +"'.\nFalse.");
   }


}