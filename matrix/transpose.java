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
//transpose of a matrix
public class transpose {
    public static void main(String args[])
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        trans(a,4,4);
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                System.out.print(a[i][j]+" ");
    }
    static void trans(int a[][],int r,int c)
    {
        int temp[][] = new int[r][c];
        for(int i=0;i<c;i++)
            for(int j=0;j<r;j++)
                temp[i][j]=a[j][i];
        for(int i=0;i<c;i++)
            for(int j=0;j<c;j++)
                a[i][j]=temp[i][j];
    }
}
