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
//given a sorted array and a sum, find if their is a triplet with given sum.
public class tripletSum {
    public static void main(String args[])
    {
        int a[]= {2,3,4,8,9,20,40};
        int x =32;
        int s = trip(a,a.length,x);
        System.out.println(s);
    }
    static int trip(int a[],int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            int b=sum(a,i+1,n-1,x-a[i]);
            if(b == 1)
                return 1;
        }
        return -1;
    }
    static int sum(int a[],int l,int h,int sum)
    {
        while(l<=h)
        {
            if(a[l]+a[h]==sum)
                return 1;
            else if(a[l]+a[h]>sum)
                h=h-1;
            else
                l=l+1;
        }
        return -1;
    }
}
