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
//left rotate the array by one O(n)
public class leftRotate {
    public static void main(String args[]){
        int arr[] = {2,4,3,6,5};
        rotate(arr,arr.length);
    }
    static void rotate(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
