// Michael Russell
// CS 4110 - 7 am
// Assignment #3
// Dr. Rague
// Due: 11/30/18
// Version: 1.0
// -----------------------------------------------------------------
// Turing Machine: all words containing b^n followed by a^n+1
// Alphabet = {a,b}
// -----------------------------------------------------------------

public class TM2
{
  public static void main(String[] args)
  {
    String[] C  =
      {"0,a=>#,R,0",
       "0,b=>B,R,1",
       "1,b=>b,R,1",
       "1,A=>A,R,1",
       "1,a=>A,L,2",
       "2,A=>A,L,2",
       "2,b=>b,L,3",
       "2,B=>B,R,4",
       "3,b=>b,L,3",
       "3,B=>B,R,0",
       "4,A=>A,R,4",
       "4,a=>a,R,5",
       "4,b=>B,R,0",
       "5,a=>#,R,0",
       "5,#=>#,R,6"};
    char[] ST = {'R','R','R','R','R','R','H'};

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
