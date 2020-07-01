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

public class infiniteArray {
    public static void main(String args[])
    {
        int a[] = {1,10,15,20,40,60,80,100,200,500,1000};
        int x = 100;
        if(a[0]==x) System.out.print(0);
        int i=1,b=0;
        while(a[i]<x)
        {
            i=i*2;
            if(a[i]==x)
            {
                b = i;
                break;
            }
        }
        System.out.print(b);
        int l=0,h=i/2+1;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]==x)
            {
                System.out.println(mid);
                break;
            }
            else if(a[mid]>x)
                h=mid-1;
            else if(a[mid]<x)
                l=mid+1;
        }
    }
}
