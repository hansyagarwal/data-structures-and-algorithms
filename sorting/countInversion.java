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
//count inversions
//{2,4,1,3,5}
// (2,1) (4,1) (4,3)
// ans 3
public class countInversion {
    public static void main(String args[])
    {
        int a[] = {2,4,1,3,5};
        int n = a.length;
        count(a,n);
    }
    static void count(int a[],int n)
    {
        int i=0,j=i+1,c=0;
        while(i<n)
        {
            if(a[i]>a[j] && i<j)
            {
                c++;
                j++;
                continue;
            }
            else
                i++;
            System.out.println(c);
        }
        System.out.println(c);
    }
}
