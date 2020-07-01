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
//10 20 30 40
//15 25 35 45
//27 29 37 48
//32 33 39 50
public class rowColSearch {
    public static void main(String args[])
    {
        int a[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int r=4,c=4,i=0,j=c-1;
        int x=29;
        while(i<r && j>=0)
        {
            if(a[i][j]==x)
            {
                System.out.println(i+" "+j);
                return;
            }
            else if(a[i][j]>x)
                j--;
            else
                i++;
        }
        System.out.print("not found");
    }
}
