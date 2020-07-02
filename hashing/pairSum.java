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
//pair with given sum in array
import java.util.*;
public class pairSum {
    public static void main(String argsp[])
    {
        int a[] = {11,5,6};
        int sum=10;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(h.contains(sum-a[i]))
            {
                System.out.println("yes");
                break;
            }
            h.add(a[i]);
        }
        System.out.println("no");
    }
}
