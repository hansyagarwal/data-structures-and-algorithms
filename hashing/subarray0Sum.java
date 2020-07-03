/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.hashing;

/**
 *
 * @author DELL
 */
//find the subarray with 0 sum
import java.util.*;
public class subarray0Sum {
    public static void main(String args[])
    {
        int a[] = {1,4,13,-3,-10,5};
        int pre=0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            pre=pre+a[i];
            if(h.contains(pre))
            {
                System.out.print("true");
                break;
            }
            if(pre==0)
            {
                System.out.print("true");
                break;
            }
            h.add(pre);       
        }
        System.out.print("no");
    }
}
