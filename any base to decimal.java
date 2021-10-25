/*
PEPCODING GETTING STARTED FUNCTIONS AND ARRAYS

DAY-13

ANY BASE TO DECIMAL
*/
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int nn=0;
      int c=0;
      while(n>0){
        int x=n%10;
        nn+=x*Math.pow(b,c);
        n=n/10;
        c+=1;
      }
      return nn;
   }
  }