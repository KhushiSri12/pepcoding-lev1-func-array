/*
PEPCODING GETTING STARTED FUNCTION AND ArraYS 

ANY BASE TO ANY BASE CONVERSION
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1= scn.nextInt();
     int  b2= scn.nextInt();
     int res1=anybasetodecimal(n,b1);
     int res=decimaltoanybase( res1, b2);
     System.out.println(res);
   }  
  public static int anybasetodecimal(int n,int b1){
    int c=0;
    int p=0;
    while(n>0){
        int r=n%10;
        c=c+r*(int)Math.pow(b1,p);
        n=n/10;
        p++;
      }
    return c;
  }
 public static int decimaltoanybase(int n,int b2){
     int c=0;
     int p=0;
     while(n>1){
        int r=n%b2;
        c=c+r*(int)Math.pow(10,p);
        n=(int)n/b2;
        p++;
        
     }
     return c;
 }
  }
 