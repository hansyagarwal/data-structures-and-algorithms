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
//index of first occurence
public class firstIndex {
    public static void main(String args[])
    {
        int a[] = {5,10,10,15,20,20,20};
        int l=0,h=a.length-1;
        int x=20;
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
            if(a[mid-1] == a[mid])
                System.out.println(mid-1);
            else if(a[mid+1]== a[mid])
                System.out.println(mid+1);
            else
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
