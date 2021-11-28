/*
PEPCODING GETTING STARTED FUNCTION AND ArraYS 

SPAN OF ARRAY
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int ma=arr[0];
    int mi=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>ma){
            ma=arr[i];
        }
        if(arr[i]<mi){
            mi=arr[i];
        }
    }
    int sp=ma-mi;
    System.out.println(sp);
    
 }

}