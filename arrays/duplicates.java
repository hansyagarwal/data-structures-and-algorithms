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
//delete duplicates in array without creating new array
public class duplicates {
    public static void main(String args[]){
        int[] a = {10,20,20,30,30,30};
        System.out.println(dup(a,a.length));
        System.out.println(dup1(a,a.length));
    }
    static int dup(int a[],int n){
       int temp[] = new int[n];
       temp[0]=a[0];
       int res=1;
       for(int i=0;i<n;i++){
           if(temp[res-1]!=a[i]){
               temp[res] = a[i];
               res++;
           }
       }
       return res;
    }
    static int dup1(int a[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(a[i]!=a[res-1])
            {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }
}
