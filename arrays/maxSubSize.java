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
//maximum subarray of size k
public class maxSubSize {
    public static void main(String args[])
    {
        int a[] = {1,8,30,-5,20,7};
        int k=3;
        maxSize(a,a.length,k);
    }
    static void maxSize(int a[],int n,int k)
    {
        int res = 0;
        for(int i=0;i<k;i++)
            res += a[i];
        int max_sum = res;
        for(int i=k;i<n;i++)
        {
            res+=a[i]-a[i-k];
            max_sum= Math.max(max_sum,res);
        }
        System.out.println(max_sum);
    }
}
