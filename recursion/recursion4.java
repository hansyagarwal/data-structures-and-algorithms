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
//palindrome
public class recursion4 {
    public static void main(String args[]){
        String n = "aabab";
        System.out.println(fun(n,0,n.length()-1));
    }
    static boolean fun(String n,int s,int e){
        if(s==e) return true;
        if(s>e) return true;
        if(n.charAt(s) != n.charAt(e)){
            return false;
        }
        return fun(n,s+1,e-1);
    }
}
