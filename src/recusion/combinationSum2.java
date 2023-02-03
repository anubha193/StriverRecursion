package recusion;

import java.util.*;

public class combinationSum2 {
	static void sequence(int arr[],int ind,ArrayList<Integer> al,int sum,ArrayList<ArrayList<Integer>> res)
    {
   		 if(sum==0) {
   		 res.add(new ArrayList(al));
   		 return;
   		 }
   	for(int i=ind;i<arr.length;i++)
   	{
   		if(i>ind && arr[i]==arr[i-1])continue;
   		if(arr[i]>sum)break;
   	     al.add(arr[i]);
    	 sequence(arr,i+1,al,sum-arr[i],res);
    	 al.remove(al.size()-1);
   		
   	}
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		 int arr[]=new int[n];
	        for(int i=0;i<n;i++)arr[i]=i+1;
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		int sum=3;
		sequence(arr,0,al,sum,res);
		System.out.println(res);
	
	}
}


