/*
"Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other."

A simple program to check if one string is a permutation of the other.
By https://github.com/J-Nying
*/


import java.io.*;
import java.util.*;
import javax.swing.*;

public class isPermutation{

   public static void main(String[] args){
      
      String input1 = JOptionPane.showInputDialog(null, "This program will check if one string is a Permuation of the other.\nInput first word here:");
      String input2 = JOptionPane.showInputDialog(null, "Input second word here.");
      

      
      if (checkIfPermutation(input1, input2)){
         JOptionPane.showMessageDialog(null, input2 + " is a permutation of " + input1 + ".");
      }
      
      else{
         JOptionPane.showMessageDialog(null, input2 + " is not a permutation of " + input1 + ".");
      }
      
   }



   public static boolean checkIfPermutation(String a, String b){
      
      if(a.length()!=b.length()){
         return false;
      }
            
      else{
         return sortString(a).equals(sortString(b));
      }
   }

   //This method "sortString" was taken from Cracking the Coding Interview book.
   public static String sortString(String toSort){
   
   char [] charArray = toSort.toCharArray();
   java.util.Arrays.sort(charArray);
   return new String(charArray);

   }


}
