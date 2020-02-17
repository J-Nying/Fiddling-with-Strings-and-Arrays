/*
"String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
'compressed' string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z)."

This is my first failed attempt at answering this question. Instead of printing the number of consecutive characters, it prints the total number next to each.
Example: aabcccccaaa would become a5b1c5
instead of a2blc5a3 like the question requires.

I have another program called compressString.java that is correct.

By Jekainden
*/

import java.io.*;
import java.util.*;
import javax.swing.*;

public class stringCompression{

   public static void main (String[] args){
      String input = JOptionPane.showInputDialog(null, "Insert a word with no spaces here:");
      
      char[] finalCharArray=createCharacterArray(input);
      int[] finalCount=countArray(createCharacterArray(input), input);
      String finalString="";
      
      for(int i=0; i<finalCount.length; i++){ 
         if(finalCount[i]>0){
            finalString = finalString + finalCharArray[i]+ finalCount[i];
         }
      }
      
      JOptionPane.showMessageDialog(null, "Original input: " + input + "\nHere's the compressed version: " + finalString);

   }
   
   
      
   
   public static char[] createCharacterArray(String str){
		String s	= str;
		char [] charArray	= new	char[s.length()];

		for (int	i=0; i<s.length(); i++){
      	if	(doesNotContain(charArray,s.charAt(i))){
   			charArray[i]=s.charAt(i);
			}
		}
      
      return charArray;
	}
   
   public static boolean doesNotContain(char	[]	a,	char c){
      for(int i=0; i<a.length; i++){
			if	(a[i]==c){
			   return false;
			}   
		 }
		return true;
	}


   public static int[] countArray(char [] c, String u){
   
      char [] b =	c;
   	int [] charCount = new int[c.length];
   	String t	= u;
         
		for(int i =	0;	i<b.length;	i++){
         for(int j =	0;	j<t.length(); j++){
				if(b[i]==t.charAt(j)){
				charCount[i]++;
				}
         }

   }  
      return charCount;
}


}