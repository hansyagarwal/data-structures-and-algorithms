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
//calculate maximum consecutive ones
public class consones {
    public static void main(String args[])
    {
        int a[] = {0,1,1,1,0,1,1};   
        con(a,a.length);
    }
    static void con(int a[],int n)
    {
        int f=0;
        int count=0;
       for(int i=0;i<n;i++)
        {
            
            if(a[i]==0)
                break;
            else
                count++;
                f = Math.max(count,f);
                
        }
        System.out.println(f);
    }
}
