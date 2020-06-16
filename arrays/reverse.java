/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.arrays;

/**
 *
 * @author DELL
 */
//time complexity O(n)
public class reverse {
   public static void main(String args[]){
       int[] a = {10,5,6,7,30};
       rev(a,a.length);
   }
   static void rev(int a[],int n){
       int k =n-1;
       for(int i=0;i<n/2;i++){
           int temp=0;
           temp = a[i];
           a[i]=a[k];
           a[k]=temp;
           k=k-1;
       }
       
       for(int j=0;j<n;j++){
           System.out.print(a[j] + " ");
       }
       
       
       
   }
}
