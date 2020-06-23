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
// i/p {2,8,3,9,6,5,4}
// o/p 0,2-> 2+8+3
// o/p 1,3-> 8+3+9
public class prefixSum {
    public static void main(String args[])
    {
        int a[] = {2,8,3,9,6,5,4};
        sum(a,0,6);
    }
    static void sum(int a[],int l,int r)
    {
        int sum =0;
        for(int i=l;i<=r;i++)
            sum+=a[i];
        System.out.println(sum);
    }
}
