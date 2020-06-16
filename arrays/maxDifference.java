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
//max value of a[j]-a[i] such that j>i
//T.C. O(n)
public class maxDifference {
    public static void main(String args[])
    {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(diff(arr,arr.length));
    }
    static int diff(int a[],int n){
        int res = a[1]-a[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                res = Math.max(res, a[j]-a[i]);
            }
        }
        return res;
    }
    
}
