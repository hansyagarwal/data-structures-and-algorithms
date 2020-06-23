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
//minimum consecutive flips

public class minconsFlip {
    public static void main(String args[])
    {
        int a[] = {0,0,1,1,0,0,1,1,0};
        flips(a,a.length);
    }
    static void flips(int a[], int n)
    {
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
            {
                if(a[i]!=a[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i-1);
            }
        }
        if(a[n-1]!=a[0])
            System.out.println(n-1);
    }
}
