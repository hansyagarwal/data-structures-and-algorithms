/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author DELL
 */
//print intersection of 2 sorted arrays
public class intersection {
    public static void main(String args[])
    {
        int a[] = {3,5,10,10,10,15,15,20};
        int b[] = {5,10,10,15,30};
        inter(a,b,b.length,a.length);
    }
    static void inter(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else
            {
                System.out.println(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}
