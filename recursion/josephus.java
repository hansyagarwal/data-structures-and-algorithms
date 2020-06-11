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
public class josephus {
    public static void main(String args[]){
        System.out.println(jos(5,3));
    }
    static int jos(int n,int k){
        if(n==1)
            return 0;
        return (jos(n-1,k)+k)%n;
    }
    
    
}
