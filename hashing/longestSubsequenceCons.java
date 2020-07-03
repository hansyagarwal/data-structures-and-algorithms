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
//longest consecutive subsequence
import java.util.*;
public class longestSubsequenceCons {
    public static void main(String args[])
    {
        int a[] = {1,9,3,10,4,20,2};
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
            h.add(a[i]);
        int curr=0,res=0;
        for(int i=0;i<a.length;i++)
        {
            if(h.contains(a[i]-1))
            {
                curr=1;
                while(h.contains(a[i]+curr))
                {
                    curr++;
                }
                res=Math.max(res, curr);
            }
            
        }
        System.out.print(res+1);
    }
}
