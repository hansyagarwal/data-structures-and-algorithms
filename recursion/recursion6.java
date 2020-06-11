/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.recursion;

/**
 *
 * @author DELL
 */
//rod cutting

public class recursion6 {
    public static void main(String args[]){
        System.out.println(rod(5,2,1,5));
    }
    static int rod(int n,int a,int b,int c){
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        
        int res = Math.max(Math.max(rod(n-a,a,b,c),rod(n-b,a,b,c)),rod(n-c,a,b,c));
        
        if(res==-1) return -1;
        return res+1;
    }
}
