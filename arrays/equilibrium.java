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
// {3,4,8,-9,20,6}
// yes since 3+4+8-9==6
public class equilibrium {
    public static void main(String args[])
    {
        int a[] = {3,4,8,-9,20,6};
        System.out.println(equi(a,a.length));
        System.out.println(equi1(a,a.length));
    }
    static boolean equi(int a[],int n) //O(n2)
    {
        for(int i=0;i<n;i++)
        {
            int l=0,r=0;
            for(int j=0;j<i;j++)
            {
                l+=a[j];
            }
            for(int k=i+1;k<n;k++)
            {
                r+=a[k];
            }
            if(l==r)
                return true;
        }
        return false;
    }
    static boolean equi1(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(l==sum-a[i])
                return true;
            l+=a[i];
            sum-=a[i];
        }
        return false;
    }
}
