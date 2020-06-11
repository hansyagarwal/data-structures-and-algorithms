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
//subsets of a given string
public class recursion7 {
    public static void main(String args[]){
        String s = "ab";
        subset(s,"",0);
    }
    static void subset(String s,String b,int n){
       if(n==s.length()){
           System.out.print(b+" ");
           return;
       }
       subset(s,b,n+1);
       subset(s,b+s.charAt(n),n+1);
    }
}
