/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author DELL
 */
//spirla travel matrix
public class spiral {
    public static void main(String args[])
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int h=4,c=4;
        int t=0,b=h-1,l=0,r=c-1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
                System.out.print(a[t][i]+" ");
            t++;
            for(int i=t;i<=b;i++)
                System.out.print(a[i][r]+" ");
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--)
                    System.out.print(a[b][i]+" ");
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--)
                    System.out.print(a[i][l]+" ");
                l++;
            }
        }
    }
}
