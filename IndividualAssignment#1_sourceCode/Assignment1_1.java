// Michael Russell
// CS 4110 - 7 am
// Assignment #1.1
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds numbers divisible by 7
// -----------------------------------------------------------------

public class Assignment1_1{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      int[] i = new int[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = Integer.parseInt(args[a]);    
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + DivisibleBy7(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }
   }
   
   // -----------------------------------------------------------------
   // This function returns boolean value for input being divisible by 7
   //
   // Version 1.1
   // ----------------------------------------------------------

   public static boolean DivisibleBy7(int i){
      return i<7? false:i==7? true:DivisibleBy7(i-7);
   }
}