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
public class hashmap {
    public static void main(String args[])
    {
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        m.put("gfg",10);
        m.put("ide",15);
        m.put("courses",20);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer> e: m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        if(m.containsValue(15))
            System.out.println("yes");
        else
            System.out.println("no");
        System.out.println(m.get("ide"));
        System.out.println(m.get("practice"));
        if(m.containsKey("ide"))
            System.out.println("yes");
        else
            System.out.println("no");
        m.remove("ide");
        System.out.println(m.size());
    }
}
