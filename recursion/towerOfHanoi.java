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
//tower of hanoi problem
public class towerOfHanoi {
    public static void main(String args[]){
        hanoi(2,'a','b','c');
    }
    static void hanoi(int n,char s,char a,char d){
        if(n==1){
            System.out.println("Move dist 1 from rod "+ s + " to " + d);
            return;
        }
        hanoi(n-1,s,d,a);
        System.out.println("Move disk "+n+ " from rod " + s + " to "+ d);
        hanoi(n-1,a,s,d);
    }
}
