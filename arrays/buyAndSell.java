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
//O(n)
public class buyAndSell {
    public static void main(String args[]){
        int arr[] = {1,5,3,1,2,8};
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
            {
                sum+= arr[i+1]-arr[i];
                
            }
        }
        System.out.println(sum);
    }
}
