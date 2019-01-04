// Michael Russell
// CS 4110 - 7 am
// Assignment #1.2
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds numbers that are powers of 2
// -----------------------------------------------------------------

public class Assignment1_2{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      int[] i = new int[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = Integer.parseInt(args[a]);    
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + PowersOf2(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }  
   }
   
   // -----------------------------------------------------------------
   // This function returns boolean value for input being power of 2
   //
   // Version 1.1
   // ----------------------------------------------------------
   
   public static boolean PowersOf2(int i){
      return i==1? true:(double)i/2==i/2? PowersOf2(i/2):false;
   }
}