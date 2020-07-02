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
//union of 2 unsorted arrays i.e. no. of total distinct elements;
import java.util.*;
public class union {
    public static void main(String args[])
    {
        int a[]={15,20,5,15};
        int b[]={15,15,15,20,10};
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        int res=0;
        for(int i=0;i<b.length;i++)
        {
            if(!h.contains(b[i]))
            {
                h.add(b[i]);
            }
        }
        System.out.println(h.size());
    }
}
