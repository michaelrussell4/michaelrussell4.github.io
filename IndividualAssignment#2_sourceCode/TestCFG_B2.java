// Assignment #2
// Dr. Rague
// Due: 10/19/18
// Version: 1.0
// -----------------------------------------------------------------
// This program tests a CFG according to requirments in part B.2
//    all strings of length 1 or greater that do not contain the 
//    substring aa
// 
// * template of test program made by Dr. Rague; ammended for 
//   use of this assignment
// -----------------------------------------------------------------

import java.io.*;

public class TestCFG_B2{
   public static void main(String[] args){
      // Rules
      String[] C = {"S=>P",
                    "P=>abS",
                    "P=>bS",
                    "P=>T",
                    "T=>a",
                    "T=>b",
                    "T=>ab"};
      
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
