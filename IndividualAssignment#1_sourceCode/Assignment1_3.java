// Michael Russell
// CS 4110 - 7 am
// Assignment #1.3
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds numbers that are a combinational 
// sum of the two numbers 17 and 43
// -----------------------------------------------------------------

public class Assignment1_3{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      int[] i = new int[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = Integer.parseInt(args[a]);    
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + SumXY(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }  
   }
   
   // -----------------------------------------------------------------
   // This function returns boolean value for input being sum of 
   // combinational sum of 17 and 43
   //
   // Version 1.1
   // ----------------------------------------------------------
   
   public static boolean SumXY(int i){
      return i<17? false:i==17||i==43? true:SumXY(i-17)||SumXY(i-43)? true:false;
   }
}