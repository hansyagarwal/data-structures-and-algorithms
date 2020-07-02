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
public class intersection {
    public static void main(String argsp[])
    {
        int a[]={10,15,20,15,30,30,5};
        int b[]={30,5,30,80};
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
            h.add(a[i]);
        int res=0;
        for(int i=0;i<b.length;i++)
        {
            if(h.contains(b[i]))
            {
                res++;
                h.remove(b[i]);
            }
        }
        System.out.println(res);
    }
}
