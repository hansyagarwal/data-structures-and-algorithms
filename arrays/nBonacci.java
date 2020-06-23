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
// n=3 m=8
// 0 0 1 1 2 4 7 13
public class nBonacci {
    public static void main(String args[])
    {
        int n=3,m=8;
        nfibo(n,m);
    }
    static void nfibo(int n,int m)
    {
        int a[]= new int[m];
        for(int i=0;i<n;i++)
            a[i]=0;
        a[n - 1] = 1; 
        a[n] = 1; 
        for (int i=n+1;i<m;i++) 
            a[i]=2*a[i-1] -  a[i-n-1]; 
        for (int i=0; i<m;i++) 
            System.out.print(a[i] + " "); 
    }
}
