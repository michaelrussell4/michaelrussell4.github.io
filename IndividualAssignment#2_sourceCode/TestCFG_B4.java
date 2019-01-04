// Assignment #2
// Dr. Rague
// Due: 10/19/18
// Version: 1.0
// -----------------------------------------------------------------
// This program tests a CFG according to requirments in part B.4
//    all strings that start with z, followed by N x's (N >= 0), 
//    followed by twice as many y's, and ending with z
// 
// * template of test program made by Dr. Rague; ammended for 
//   use of this assignment
// -----------------------------------------------------------------

import java.io.*;

public class TestCFG_B4{
   public static void main(String[] args){
      // Rules
      String[] C = {"S=>P",
                    "P=>zTU",
                    "P=>zz",
                    "T=>xTyy",
                    "T=>xyy",
                    "U=>z"};
      
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
