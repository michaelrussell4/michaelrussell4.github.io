// Test Turing Machine Class
public class TMTest1
{
  public static void main(String[] args)
  {
    // Language: strings in which the second letter is b
    String[] C  =
      {"0,a=>a,R,1",
       "0,b=>b,R,1",
       "1,b=>b,R,2",
       "2,a=>a,R,2",
       "2,b=>b,R,2",
       "2,#=>#,R,3"};
    char[] ST = {'R','R','R','H'};


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