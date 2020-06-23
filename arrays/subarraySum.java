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
//find subarray with given sum
// 1,4,20,3,10,5
// 33
public class subarraySum {
    public static void main(String args[])
    {
        int a[]={1,4,20,3,10,5};
        int given = 33;
        given(a,a.length,given);
        System.out.println(given1(a,a.length,given));
    }
    static void given(int a[],int n,int s) //O(n2)
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum == s)
                    System.out.println("yes");
            }
        }
    }
    static boolean given1(int a[],int n,int sum)
    {
        int curr=a[0],s=0;
        for(int e=1;e<n;e++)
        {
            while(curr>sum && s<e-1)
            {
                curr-=a[s];
                s++;
            }
            if(curr == sum)
            {
                return true;
            }
            if(e<n)
                curr+=a[e];
        }
        return (curr==sum);
        
    }
}
