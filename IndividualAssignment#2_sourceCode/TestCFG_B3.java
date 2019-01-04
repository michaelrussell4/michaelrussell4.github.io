// Assignment #2
// Dr. Rague
// Due: 10/19/18
// Version: 1.0
// -----------------------------------------------------------------
// This program tests a CFG according to requirments in part B.3
//    all strings that contain exactly one b, have 2N a's (N >= 0, 
//    N is an integer) before the b, and 2N+1 a's after the b
// 
// * template of test program made by Dr. Rague; ammended for 
//   use of this assignment
// -----------------------------------------------------------------

import java.io.*;

public class TestCFG_B3{
   public static void main(String[] args){
      // Rules
      String[] C = {"S=>P",
                    "P=>b",
                    "P=>T",
                    "T=>aaUaa",
                    "U=>T",
                    "U=>ba"};
      
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
