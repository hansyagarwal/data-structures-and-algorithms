package dsa.recursion;
import java.util.*;

public class recursion1 { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        fun(sc.nextInt()); //print from n to 1
        
        fun1(sc.nextInt()); //print from 1 to n
    }
    
    static void fun(int n){
        if(n==1){
            System.out.print(" "+1);
        }
        else{
            System.out.print(" "+n);
            fun(n-1);
        }
    }
    
    static void fun1(int n){
        if(n==1){
            return;
        }
        
        fun1(n-1);
        System.out.print(n);
    }
}
