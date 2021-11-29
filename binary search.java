/*
PEPCODING GETTING STARTED FUNCTIONS AND ArrayS

BINARY SEARCH
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    int[] arr={10,20,30,40,50,60,70,80,90,100};
    int d=70;
    int l=0;
    int h=arr.length-1;
    while(l<=h){
        int m=(l+h)/2;
        if(d>arr[m]){
           l=m+1; 
        }
        else if(d>arr[m]){
           h=m-1; 
        }
        else{
           System.out.println(m);
           return;
           
        }
    }
    System.out.println(-1);
}
    
}