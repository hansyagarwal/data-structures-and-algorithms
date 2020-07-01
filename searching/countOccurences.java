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
//count no. of occurences in sorted array
public class countOccurences {
    public static void main(String args[])
    {
        int a[] = {10,20,20,20,30,30};
        int x=20;
        count(a,a.length,x);
    }
    static int count(int a[],int n,int x)
    {
        int l=0,h=n-1;
        int count=0;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]>x)
                h=mid-1;
            else if(a[mid]<x)
                l=mid+1;
            else
            {
                if(mid!=0 || a[mid-1]!=a[mid])
                    count+=1;
                else
                    h=mid-1;
            }
        }
        System.out.println(count);
        return 0;
    }
}
