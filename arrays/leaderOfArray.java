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
//i/p: {7,10,4,10,6,5,2}
//o/p: 10 6 5 2
//T.C: O(n2)
public class leaderOfArray {
    public static void main(String args[]){
        int arr[] = {7,10,4,10,6,5,2};
        leader(arr,arr.length);
    }
    static void leader(int arr[],int n){
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j]){
                    count++;
                }
            }
            //System.out.print(count);
            
            if(count==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
