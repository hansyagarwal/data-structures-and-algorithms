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
// 2 1 2 5 7 1 9 3 6 8 8
// 2 1 8 3
//o/p 2 2 1 1 8 8 3 5 6 7 9
import java.util.*;
public class relativeSoritng {
    public static void main (String[] args) {
		//code
		int a[]= {2,6,7,5,2,6,8,4};
		int b[]={2,6,4,5};
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int n=a.length;
		int o=b.length;
		for(int i=0;i<n;i++)
		{
		    if(m.containsKey(a[i]))
		        m.put(a[i],m.get(a[i])+1);
		    else
		        m.put(a[i],1);
		}
		for(int i=0;i<o;i++)
		{
		    if(m.containsKey(b[i]))
		    {
		        int c=m.get(b[i]);
		        while(c!=0)
		        {
		            System.out.print(b[i]+" ");
		            c--;
		        }
		        if(c==0)
		        {
		            m.remove(b[i]);
		        }
		    }
		}
		ArrayList<Integer> l = new ArrayList<>();
		for(Map.Entry<Integer,Integer> e:m.entrySet())
		{
		    l.add(e.getKey());
		}
		Collections.sort(l);
		Iterator it = l.iterator();
		while(it.hasNext())
		{
		    System.out.print(it.next()+" ");
		}
	}
}
