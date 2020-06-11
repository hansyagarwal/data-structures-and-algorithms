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
//sum of digit of a number using recursion

public class recursion5 {
    public static void main(String args[]) {
        System.out.println(sum(253,0));
    }
    static int sum(int n,int a){
        if(n<10){
            return n+(a);
        }
        else{
            return sum(n/10,a+n%10);
        }
    }
}
