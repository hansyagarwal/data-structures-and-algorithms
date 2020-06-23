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
//majority element
public class majority {
    public static void main(String args[])
    {
        int a[] = {2,3,4,5,5,5,5};
        System.out.println(element(a,a.length));
    }
    static int element(int a[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=i;j<n;j++)
            {
                if(a[i]==a[j])
                    count+=1;
            }
            if(count>n/2)
                return i;
                
        }
        return -1;
    }
}
