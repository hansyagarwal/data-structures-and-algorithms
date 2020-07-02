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
import java.util.*;
public class frequenct {
    public static void main(String args[])
    {
        int a[] = {10,12,10,15,10,20,12,12};
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i], m.get(a[i])+1);
            }
            else
                m.put(a[i],1);
        }
        for(Map.Entry<Integer,Integer> e: m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
    }
}
