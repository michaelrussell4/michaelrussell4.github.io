// Michael Russell
// CS 4110 - 7 am
// Assignment #3
// Dr. Rague
// Due: 11/30/18
// Version: 1.0
// -----------------------------------------------------------------
// Turing Machine: all words of the form q^n p^n q^n, n>0
// Alphabet = {p,q}
// -----------------------------------------------------------------

public class TM4
{
  public static void main(String[] args)
  {
    String[] C  =
      {"0,q=>*,R,1",
       "1,q=>q,R,1",
       "1,p=>p,R,2",
       "2,p=>p,R,2",
       "2,q=>q,L,3",
       "3,p=>q,R,4",
       "4,q=>q,R,4",
       "4,#=>#,L,5",
       "5,q=>#,L,6",
       "6,q=>#,L,7",
       "7,q=>q,L,7",
       "7,p=>p,L,7",
       "7,*=>*,R,0",
       "0,#=>#,R,8"};
    char[] ST = {'R','R','R','R','R','R','R','R','H'};

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
