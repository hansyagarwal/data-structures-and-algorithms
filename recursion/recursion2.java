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
public class recursion2 {
    public static void main(String args[]){
        fun(5,1);
    }
    //tail recursion
    static void fun(int n,int x){
        if(x==n){
            System.out.println(n);
        }
        else{
        System.out.println(x);
        fun(n,x+1);
        }
    }
}
