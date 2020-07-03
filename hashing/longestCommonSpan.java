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
//longest common span with same sum in binary array
//[0,1,0,0,0,0]
//[1,0,1,0,0,1]
//4
import java.util.*;
public class longestCommonSpan {
    public static void main(String args[])
    {
        int a1[]={0,1,0,0,0,0};
        int a2[]={1,0,1,0,0,1};
        int temp[] = new int[a1.length];
        int n=a1.length;
        for(int i=0;i<n;i++)
            temp[i]=a1[i]-a2[i];
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int pre=0,res=0;
        for(int i=0;i<n;i++)
        {
            pre+=temp[i];
            if(pre==0)
                res=i+1;
            if(!m.containsKey(pre))
                m.put(pre, i);
            if(m.containsKey(pre))
                res=Math.max(res,i-m.get(pre));
        }
        System.out.println(res);
    }
}
