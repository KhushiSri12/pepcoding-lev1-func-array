/*PEPCODING GETTING STARTED FUNCTION AND ARRAYS 

BROKEN ECONOMY

*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
    }
    int d=sc.nextInt();
    int l=0;
    int h=arr.length-1;
    int floor=0;
    int ceil=0;

    while(l<=h){

        int m=(int)(l+h)/2;
        if(d<arr[m]){
            h=m-1;
            ceil=arr[m];
        }
        else if(d>arr[m]){
            l=m+1;
            floor=arr[m];
            
        }
        else {
            ceil=arr[m];
            floor=arr[m];
            break;
        }
        }
    System.out.println(ceil);
    System.out.println(floor);
    
    }
}

