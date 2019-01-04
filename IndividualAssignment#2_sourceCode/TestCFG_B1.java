// Assignment #2
// Dr. Rague
// Due: 10/19/18
// Version: 1.0
// -----------------------------------------------------------------
// This program tests a CFG according to requirments in part B.1
//    all strings that start with an odd number of a's followed 
//    by the same number of b's
// 
// * template of test program made by Dr. Rague; ammended for 
//   use of this assignment
// -----------------------------------------------------------------

import java.io.*;

public class TestCFG_B1{
   public static void main(String[] args){
      // Rules
      String[] C = {"S=>aT",
                    "T=>aaTbb",
                    "T=>b"};
      
      // declare vars for upcoming parameter use
      String inString, startWkString;
      boolean accept1;
      CFG CFG1 = new CFG(C);
      if(args.length >= 1){
         // Input string is command line parameter
         inString = args[0];
         char[] startNonTerm = new char[1];
         startNonTerm[0] = CFG1.getStartNT();
         startWkString = new String(startNonTerm);
         accept1 = CFG1.processData(inString, startWkString);
         System.out.println("  Accept String?  " + accept1);
      }
   }
}
