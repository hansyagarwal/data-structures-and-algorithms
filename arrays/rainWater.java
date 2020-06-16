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
//trapping rain water
//i/p {2,0,2}
//o/p 2
public class rainWater {
    public static void main(String args[])
    {
       int a[] = {3,0,1,2,5};
       rain(a,a.length);
    }
    static void rain(int a[],int n)
    {
        int sum=0;
        for(int i=1;i<n-1;i++)
        {
            if(a[0]>=a[n-1] || a[0]<=a[n-1])
            {
                sum+= a[0]-a[i];
            }
        }
        System.out.println(sum);
        
    }
}
