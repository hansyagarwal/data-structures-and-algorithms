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
//longest subarray with equal nos of 0 and 1
import java.util.*;
public class longestSubarraySum2 {
    public static void main(String args[])
    {
        int a[]={1,0,0,1,0,1,1};
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
                a[i]=-1;
        }
        int pre=0,res=0;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            pre=pre+a[i];
            if(pre==0)
            {
                res=i+1;
            }
            if(!m.containsKey(pre))
            {
                m.put(pre, i);
            }
            if(m.containsKey(pre))
                res=Math.max(res,i-m.get(pre));
        }
        System.out.println(res);
    }
}
