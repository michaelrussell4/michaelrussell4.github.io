// Michael Russell
// CS 4110 - 7 am
// Assignment #1.4
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds strings that are palindromes of 
// an odd length
// -----------------------------------------------------------------

public class Assignment1_4{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      String[] i = new String[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = args[a];
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + OddPalindrome(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }  
   }
   
   // -----------------------------------------------------------------
   // This function returns boolean value for input being a palindrome
   // of an odd length
   //
   // Version 1.1
   // ----------------------------------------------------------
   
   public static boolean OddPalindrome(String i){
      return i.length()==0||i.replace("a","").replace("b","").length()>0? 
         false:i.length()==1? true:i.charAt(0)==i.charAt(i.length()-1)? 
         OddPalindrome(i.substring(1,i.length()-1)):false; 
   }
}