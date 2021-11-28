/*
PEPCODING GETTING STARTED FUNCTION AND ArraYS 

FIND ELEMENT IN AN ARRAY
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
    int ans=-1;
    int d=sc.nextInt();
    for(int i=0;i<n;i++){
        if (arr[i]==d){
            ans=i;
            break;
        }
    }
    if (ans>-1){
        System.out.println(ans);
    }
    else{
       System.out.println("-1");  
    }
 }

}