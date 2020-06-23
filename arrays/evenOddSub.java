/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.arrays;

/**
 *
 * @author DELL
 */
//longest even odd subarray
// 10,12,14,7,8 = 3
// 7,10,13,14 = 4
public class evenOddSub {
    public static void main(String args[])
    {
        int arr[]={5,10,20,6,3,8};
        eosub(arr,arr.length);
        eosub1(arr,arr.length);
    }
    static void eosub(int a[],int n) //O(n2)
    {
        int res=1;
        for(int i=0;i<n;i++)
        {
             int count=1;
            for(int j=i+1;j<n;j++)
            {        
                if((a[j]%2==0 && a[j-1]%2==1) || (a[j]%2==1 && a[j-1]%2==0))
                  count+=1;  
                else
                    break;
            }          
            res = Math.max(res,count);
        }
        System.out.println(res);
    }
    static void eosub1(int a[],int n) //O(n)
    {
        int res=0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if((a[i]%2==0 && a[i+1]%2==1) || (a[i]%2==1 && a[i+1]%2==0)){
                  count+=1;  
                  res= Math.max(res,count);
            }else
                    count=1;
            
        }
        System.out.println(res);
    }
}
