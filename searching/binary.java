/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author DELL
 */
//binary search
public class binary {
    public static void main(String args[])
    {
        int a[] = {16,82,58,24,37,62,24,0,36};
        int l=0,h=a.length-1;
        int x = 36;
        search(a,l,h,x);
        
    }
    static int search(int a[],int l,int h,int x)
    {
        if(l>h){
            System.out.println(-1);
            return -1;
        }
        int mid = (l+h)/2;
        if(a[mid]== x)
            System.out.println(mid);
        else if(a[mid]>x){
            h=mid-1;
            search(a,l,h,x);
        }
        else if(a[mid]<x){
            l=mid+1;
            search(a,l,h,x);
        }
        return -1;
    }
}
