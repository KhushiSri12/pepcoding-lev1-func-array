/*
PEPCODING GETTING STARTED FUNCTION AND ArraYS 

ANY BASE ADDITION
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int c=0;
       int p=1;
       int res=0;
       while((n1>0)||(n2>0)||(c>0)){
           int d1=n1%10;
           int d2=n2%10;
           n1=n1/10;
           n2=n2/10;
           int total=d1+d2+c;
           c=c/b;
           total=total%b;
           res=res+total*p;
           p=p*10;
       }
       return res;
   }
  }