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
//longest subarray with given sum
import java.util.*;
public class longestSubarraySum {
    public static void main(String args[])
    {
        int a[]={8,3,1,5,-6,6,2,2};
        int sum=4;
        System.out.println(longest(a,a.length,sum));
    }
    static int longest(int a[],int n,int sum)
    {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int pre=0,res=0;
        for(int i=0;i<n;i++)
        {
            pre=pre+a[i];
            if(pre==sum)
                res=i+1;
            if(!m.containsKey(pre))
                m.put(pre,i);
            if(m.containsKey(pre-sum))
            {
                res=Math.max(res,i-m.get(pre-sum));
            }
        }
        return res;
    }
}
