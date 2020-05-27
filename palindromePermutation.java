/*
"Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words."

A simple program to check if one string is a permutation of a palindrome. It is case sensitive.
By https://github.com/J-Nying
*/

import java.io.*;
import java.util.*;
import javax.swing.*;


public class palindromePermutation{

	public static void main	(String[] args){
   	String input =	JOptionPane.showInputDialog(null, "enter word here:");

		if	(checkIfPalindromePermutation(input)){
			JOptionPane.showMessageDialog(null,	"True. "	+ input + " is a Permuation of a Palindrome.");
		}

		else{
			JOptionPane.showMessageDialog(null,	"False. " +	input	+ " is not a Permuation of a Palindrome.");
		}
	}


	//This is still work	in	progress.
	public static boolean checkIfPalindromePermutation(String str){
		String s	= str;
		char [] charArray	= new	char[s.length()];

		for (int	i=0; i<s.length(); i++){
      	if	(doesNotContain(charArray,s.charAt(i))){
   			charArray[i]=s.charAt(i);
			}
		}
      
      return lessThanTwoOdd(charArray,s);
	}
		


	public static boolean doesNotContain(char	[]	a,	char c){
   	
      for(int i=0; i<a.length; i++){
			if	(a[i]==c){
			   return false;
			}   
		 }
		return true;
	}



	public static boolean lessThanTwoOdd(char [] c, String u){

   	char [] b =	c;
   	int [] charCount = new int[c.length];
   	String t	= u;
   	int finalCount=0;
   
		for(int i =	0;	i<b.length;	i++){
         for(int j =	0;	j<t.length(); j++){
				if(b[i]==t.charAt(j)){
				charCount[i]++;
				}
         }

		}
      
      for(int k=0; k<charCount.length;k++){
          if(charCount[k]%2!=0){
            finalCount++;
         }      
      }
      
      return finalCount<2;
	}


}
