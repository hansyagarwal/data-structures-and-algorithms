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
//count no. of 1s in a sorted array
public class countOnes {
    public static void main(String args[])
    {
        int a[] = {1,1,1,1,1,0,0,0};
        int b = count(a,a.length);
        System.out.println(a.length-b);
    }
    static int count(int a[],int n){
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]>1)
                h=mid-1;
            else if(a[mid]<1)
                l=mid+1;
            else
            {
                if(mid==0 || a[mid-1]!=a[mid])
                    return mid;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
}
