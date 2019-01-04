// Test Turing Machine Class
public class TestTM2
{
  public static void main(String[] args)
  {
    // Language: strings with N a's followed by N b's
    String[] C  =
      {"0,a=>A,R,1",
       "1,a=>a,R,1",
       "1,B=>B,R,1",
       "1,b=>B,L,2",
       "2,a=>a,L,3",
       "2,B=>B,L,2",
       "2,A=>A,R,4",
       "3,a=>a,L,3",
       "3,A=>A,R,0",
       "4,B=>B,R,4",
       "4,#=>#,R,5"};
    char[] ST = {'R','R','R','R','R','H'};

    String inString;
    boolean accept1;
    TM TM1 = new TM(C, ST);
    if(args.length >= 1){
      // Input string is command line parameter
      inString = args[0];
      // Process input string
      accept1 = TM1.processData(inString);
      System.out.println("\n Valid string?   " + accept1);
    }
  }// end main
} // end class
