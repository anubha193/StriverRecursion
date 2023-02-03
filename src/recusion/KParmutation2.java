package recusion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KParmutation2 {
	static  void parmute( List<String> al,int[] nums,int ind,int k)
	{
	    
	   if(ind==nums.length)
	    {
	        List<Integer> temp=new ArrayList<>();
	        String s="";
	        for(int i=0;i<nums.length;i++)
	        {
	           s=s+nums[i];
	        }
	        al.add(s);
	      
	   }
	    for(int i=ind;i<nums.length;i++)
	    {
	        swap(nums,i,ind);
	        parmute(al,nums,ind+1,k);
	         swap(nums,i,ind);
	    }
	    
	}
	static void swap(int arr[],int i,int j)
	{
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int nums[]= {1,2,3};
	        List<String> al=new ArrayList<>();
	        int k=3;
	        parmute(al,nums,0,k);
	        Collections.sort(al);
	        System.out.println(al.get(3));
		}


}
