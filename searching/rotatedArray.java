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
//search in sorted rotated array
public class rotatedArray {
    public static void main(String args[])
    {
        int a[] = {10,20,40,60,5,8};
        int x = 5;
        int s = search(a,a.length,x);
        System.out.println(s);
        
    }
    static int search(int a[],int n,int x)
    {
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
        if(a[mid]==x)
            return mid;
        if(a[l]<a[mid])
        {
            if(x>=a[l] && x<a[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        else
        {
            if(x<=a[h] && x>a[mid])
                l=mid+1;
            else
                h=mid-1;
        }
        }
        return -1;
    }
}
