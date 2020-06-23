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
//known as kadane's algorithm
// {2,3,-8,7,-1,2,3} = 11
// {5,8,3} = 16
// {-6,-1,-8} = -1
public class maxSubarray {
    public static void main(String args[])
    {
        int[] arr = {1,-2,3,-1,2};
        maxsum(arr,arr.length);
        maxsum1(arr,arr.length);
    }
    static void maxsum(int a[],int n) //O(n2)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                res=Math.max(res,sum);
            }
        }
        System.out.println(res);
    }
    static void maxsum1(int a[],int n) //O(n)
    {
        int res = a[0];
        int maxE = a[0];
        for(int i=1;i<n;i++)
        {
            maxE = Math.max(maxE+a[i], a[i]);
            res = Math.max(res,maxE);
        }
        System.out.println(res);
    }
}
