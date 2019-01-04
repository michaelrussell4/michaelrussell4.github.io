// Michael Russell
// CS 4110 - 7 am
// Assignment #3
// Dr. Rague
// Due: 11/30/18
// Version: 1.0
// -----------------------------------------------------------------
// Turing Machine: all words containing 'bbb'
// Alphabet = {a,b}
// -----------------------------------------------------------------

public class TM1
{
  public static void main(String[] args)
  {
    String[] C  =
      {"0,a=>a,R,0",
       "0,b=>b,R,1",
       "1,a=>a,R,0",
       "1,b=>b,R,2",
       "1,a=>a,R,0",
       "2,b=>b,R,3",
       "2,a=>a,R,0"};
    char[] ST = {'R','R','R','H'};

    String inString;
    boolean accept1;
    TM TM1 = new TM(C, ST);
    if(args.length >= 1){
      // Input string is command line parameter
      inString = args[0];
      // Process input string
      accept1 = TM1.processData(inString);
      System.out.println(inString+"\t\t Valid string?   " + accept1);
    }
  }// end main
} // end class
