// Michael Russell
// CS 4110 - 7 am
// Assignment #1.5
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds strings that contain aba
// -----------------------------------------------------------------

public class Assignment1_5{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      String[] i = new String[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = args[a];
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + ContainsABA(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }  
   }
   
   // -----------------------------------------------------------------
   // This function recursively finds strings that contain aba
   //
   // Version 1.1
   // ----------------------------------------------------------
   
   public static boolean ContainsABA(String i){
      return i.length()<3||i.replace("a","").replace("b","").length()>0? 
      false:i.equals("aba")? true:
      ContainsABA(i.substring(1,i.length()))||
      ContainsABA(i.substring(0,i.length()-1))? true:false; 
   }
}