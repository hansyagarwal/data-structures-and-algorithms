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
public class snakePattern {
    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<a[i].length;j++)
                    System.out.print(a[i][j]+ " ");
            }
            else
            {
                for(int j=a[i].length-1;j>=0;j--)
                    System.out.print(a[i][j]+" ");
            }
        }
    }
}
