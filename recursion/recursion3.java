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
//factorial with tail recursion
public class recursion3 {
    public static void main(String args[]){
        System.out.println(fun(5,1));
    }
    static int fun(int n,int x){
        if(n==x){
            return n;
        }
        else{
            return x*fun(n,x+1);
        }
    }
}
