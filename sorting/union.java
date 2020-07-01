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
//union of 2 sorted arrays
public class union {
    public static void main(String args[])
    {
        int a[] = {3,8,10};
        int b[] = {2,8,9,10,15};
        union(a,b,a.length,b.length);
    }
    static void union(int a[],int b[],int n,int m)
    {
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else if(b[j]>a[i])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if(i==0 || a[i]!=a[i-1])
                System.out.print(a[i++]+" ");
        }
        while(j<m)
        {
            if(j==0 || b[j]!=b[j-1])
                System.out.print(b[j++]+" ");
        }
    }
}
