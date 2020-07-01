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
//find pair in sorted arary which gives sum x
//2 pointer method
public class sortedarraysum {
    public static void main(String args[])
    {
        int a[]={2,4,8,9,11,12,20,30};
        int x = 23;
        int s = sum(a,a.length,x);
        System.out.println(s);
    }
    static int sum(int a[],int n,int x)
    {
        int l=0,h=n-1;
        while(l<=h)
        {
            if(a[l]+a[h]==x)
                return 1;
            else if(a[l]+a[h]>x)
                h=h-1;
            else
                l=l+1;
        }
 
        return -1;
    }
}
