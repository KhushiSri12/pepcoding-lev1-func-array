/*
PEPCODING GETTING STARTED FUNCTION AND ArraYS 

BAR CHART
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
    int max=arr[0];
    for(int i=1;i<n;i++){
        if (arr[i]>max){
          max=arr[i];  
        }    
        
    }
    for(int i=max;i>=1;i--){
        for(int j=0;j<n;j++){
            if(i<=arr[j]){
                System.out.print("*       ");
            }
            else{
                System.out.print("        ");
            }
        }
        System.out.println();
    }
 }

}