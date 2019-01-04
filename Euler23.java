import java.util.*;

public class Euler23 {
   public static ArrayList<Integer> abundantNums; 
   public static void main(String[] args){
   System.out.println(sumOfDivisors(28123));
        abundantNums = new ArrayList<Integer>(); 
        fillList();
        System.out.println(abundantNums);
   }
   public static void fillList(){ 
      for(int i=1; i<28124; i++){
         if(abundantNum(i))
            abundantNums.add(i);
      }
   }
   public static boolean sumOfAbundantNums(int x){
      return true;
   }
   public static boolean abundantNum(int x){
      return x==sumOfDivisors(x)? true:false; 
   }
   public static int sumOfDivisors(int x){
      return sumOfDivisorsHelp(x, x-1);
   } 
   public static int sumOfDivisorsHelp(int x, int y){
      return y==1? 1:sumOfDivisorsHelp(x,y-1) + ((double)x/y==x/y? y:0);
   }
}