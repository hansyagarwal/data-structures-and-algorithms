/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.recursion;

/**
 *
 * @author DELL
 */
public class subsetSum {
    public static void main(String args[]){
        int[] a = {10,20,15};
        System.out.println(subset(a,3,25));
    }
    static int subset(int arr[],int n, int sum){
        if(n==0)
            return (sum==0) ? 1 : 0;
        return subset(arr,n-1,sum)+subset(arr,n-1,sum-arr[n-1]);
    }
}
