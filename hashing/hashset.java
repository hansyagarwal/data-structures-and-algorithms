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
public class hashset {
    public static void main(String args[])
    {
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h.size());
        h.remove("ide");
        System.out.println(h.size());
        for(String s:h)
        {
            System.out.print(s+" ");
        }
        System.out.println(h);
        System.out.println(h.contains("ide"));
        Iterator<String> i = h.iterator();
        while(i.hasNext())
            System.out.println  (i.next()+" ");
        System.out.println(h.isEmpty());
    }
}
