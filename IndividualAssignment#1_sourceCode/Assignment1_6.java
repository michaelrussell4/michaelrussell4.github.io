// Michael Russell
// CS 4110 - 7 am
// Assignment #1.6
// Dr. Rague
// Due: 09/14/18
// Version: 1.0
// -----------------------------------------------------------------
// This program recursively finds strings that contain aba
// -----------------------------------------------------------------

public class Assignment1_6{
   public static void main(String[] args){
      //The number of arguments you wish to enter; default: 1
      int numArgs = 1;
      String[] i = new String[numArgs]; 
      if(args.length > 0){
         for(int a=0; a<numArgs; a++)
            i[a] = args[a];
         for(int aa=0; aa<i.length; aa++)
            System.out.println("X = " + i[aa] + " Member? " + ABPlus(i[aa]));
      }
      else{
         System.out.println("Invalid input");
      }  
   }
   
   // -----------------------------------------------------------------
   // This function recursively finds strings that follow these rules: 
   // 1. Words a and b are in ABPlus
   // 2. If v and w are words then so are vw and v+w
   // 
   // Note: any combination of a's and b's will be allowed so this task
   // may be summed up in finding whether the '+'s are placed correctly
   //
   // Version 1.1
   // ----------------------------------------------------------
   
   public static boolean ABPlus(String i){
      return !i.contains("+")&&i.replace("a","").replace("b","").equals("")? 
         true:i.contains("a+a")? ABPlus(i.replace("a+a","aa")):
         i.contains("a+b")? ABPlus(i.replace("a+b","ab")):
         i.contains("b+a")? ABPlus(i.replace("b+a","ba")):
         i.contains("b+b")? ABPlus(i.replace("b+b","bb")):false;
   }
}