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
//rotate array by d
public class leftrotateByD {
    public static void main(String args[]){
        int a[] = {10,5,6,7,30};
        rotate(a,a.length,5);
    }
    static void rotate(int a[],int n,int d){
        int b[] = new int[n];
        for(int i=0;i<d;i++)
            b[i]=a[i];
        for(int i=d;i<n;i++)
            a[i-d]=a[i];
        for(int j=0;j<d;j++)
            a[n-d+j]=b[j];
        for(int j=0;j<n;j++)
            System.out.print(a[j]+" ");
    }
}
