/*
PEPCODING GETTING STARTED  FUNCTION AND ARRAYS 

DIFFERENCE OF TWO ARRAYS
*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int [] arr1=new int[n1];
    for(int i=0;i<n1;i++){
        arr1[i]=sc.nextInt();
        
    }
    int n2=sc.nextInt();
    int [] arr2=new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i]=sc.nextInt();
    }
    int [] arr3=new int[n2];
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=arr3.length-1;
    int c=0;
    while(k>=0){
        int d=0;
        int a1v=i>=0?arr1[i]:0;
        if(arr2[j]+c>=a1v){
            d=arr2[j]+c-a1v;
          
            c=0;
        }
        else{
             d=arr2[j]+10-a1v+c;
             c=-1;
        }
        arr3[k]=d;
        i--;
        j--;
        k--;
        
    }
    int ind=0;
    while(ind<arr3.length){
        if (arr3[ind]==0){
            ind++;
        }
        else{
            break;
        }
    }
    while(ind<arr3.length){
        System.out.println(arr3[ind]);
        ind++;
    }

   
}
}