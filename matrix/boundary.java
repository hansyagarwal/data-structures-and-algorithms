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
//print boundary elements
//1234
//5678
//9101112
//13141516
public class boundary {
    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        boundary(a,4,4);
    }
    static void boundary(int a[][],int r,int c)
    {
        if(r==1)
        {
            for(int i=0;i<c;i++)
                System.out.print(a[0][c]+" ");
        }
        else if(c==1)
        {
            for(int i=0;i<r;i++)
                System.out.print(a[c-1][r]+" ");
        }
        else
        {
            for(int i=0;i<c;i++)
                System.out.print(a[0][i]+" ");
            for(int i=0;i<r;i++)
                System.out.print(a[i][c-1]+" ");
            for(int i=c-2;i>=0;i--)
                System.out.print(a[r-1][i]+" ");
            for(int i=r-2;i>=1;i--)
                System.out.print(a[i][0]+" ");
        }
    }
        
}
