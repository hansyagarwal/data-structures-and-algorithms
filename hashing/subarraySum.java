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
//subarray with given sum
import java.util.*;
public class subarraySum {
    public static void main(String args[])
    {
        int a[]={5,8,6,13,3,-1};
        int sum=22;
        HashSet<Integer> h = new HashSet<Integer>();
        int pre=0;
        for(int i=0;i<a.length;i++)
        {
            pre=pre+a[i];
            if(pre==22)
            {
                System.out.println("true");
                break;
            }
            if(h.contains(pre-sum))
            {
                System.out.print("yes");
                break;
            }
            h.add(pre);
        }
        System.out.print("false");
    }
}
