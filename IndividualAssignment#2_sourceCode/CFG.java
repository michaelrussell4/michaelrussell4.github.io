// Michael Russell
// CS 4110 - TTH 7:30 am
// Assignment #2
// Dr. Rague
// Due: 10/19/18
// Version: 1.0
// -----------------------------------------------------------------
// This class defines a Context-Free Grammar object
// -----------------------------------------------------------------

public class CFG {

   private String[] Code; 
   private char startNT; 
   
   // ----------------------------------------------------------
   // Constructor: initializes the Code array/rules for the object
   // as well as the starting non-terminal, startNT
   // 
   // Version 1.1
   // ----------------------------------------------------------
   CFG(String[] C){
      Code = C;
      startNT = C[0].charAt(0);
   }
   
   // ----------------------------------------------------------
   // Get: startNT; returns startNT char
   //
   // Version 1.1
   // ----------------------------------------------------------
   char getStartNT(){
      return startNT;
   }
   
   // ----------------------------------------------------------
   // Set: startNT; sets the start
   //
   // Version 1.1
   // ----------------------------------------------------------
   void setStart(char stNT){
      startNT = stNT;
   }
   
   // ----------------------------------------------------------
   // Processes all possible combinations of rules by brute force
   // and checks if any routes produce inString, proving whether
   // inString is a valid word according to this CFG
   //
   // Version 1.1
   // ----------------------------------------------------------
   boolean processData(String inString, String wkString){
   
      // if wkString equals inString return true
      if(wkString.equals(inString)){
         return true;
      }
   
      // if wkString is longer than inString terminate branch
      if(wkString.length() > inString.length()){
         return false; 
      }
      
      // search for non-terminal in wkString
      if(wkString.toLowerCase().equals(wkString)){
         return false; 
      }
      
      boolean anyMatch = false; 
      
      for(int i=0; i<wkString.length(); i++){
         
         // check if this index is a non-terminal
         if(wkString.toUpperCase().charAt(i) == wkString.charAt(i)){
            
            // test replacing non-terminal for each applicable rule
            for(int ii=0; ii<Code.length; ii++){
               
               // check if this rule applies
               if(Code[ii].charAt(0) == wkString.charAt(i)){
                  
                  // make a new wkString to use for the next test
                  String newWkString = wkString.substring(0,i) + 
                     Code[ii].substring(3) + wkString.substring(i+1);
                  
                  // test if this rule leads to a solution
                  anyMatch |= processData(inString, newWkString);
                  
                  // return true if anyMatch is true
                  if(anyMatch){
                     return true; 
                  }
               
               }
               
            }
            
         }
         
      }
      
      // return the result--will be false if this line is reached
      return anyMatch;
            
   }
   
}