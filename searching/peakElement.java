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
//find peak element
//not smaller than neighbours

public class peakElement {
    public static void main(String args[])
    {
        int a[] = {5,20,40,30,20,50,60};
        int x = peak(a,a.length);
        System.out.println(x);
    }
    static int peak(int a[],int n)
    {
        int l=0, h=n-1;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if((mid ==0 || a[mid-1]<a[mid]) && (mid==n-1 || a[mid+1]<a[mid]))
                return mid;
      
            if(mid>0 && a[mid-1]>=a[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
