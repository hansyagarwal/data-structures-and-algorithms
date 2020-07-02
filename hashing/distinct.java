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
public class distinct {
    public static void main(String args[])
    {
        int a[] = {15,12,13,12,13,13,18};
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        System.out.print(h.size());
    }
}
