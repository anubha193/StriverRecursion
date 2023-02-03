package recusion;

import java.util.ArrayList;

public class CombinationSum {
	 static void sequence(int arr[],int ind,ArrayList<Integer> al,int sum)
     {
    	 if(ind==arr.length)
    	 {
    		 if(sum==0)
    		 System.out.println(al);
    		 return;
    	 }
    	
    	 
    	 if(arr[ind]<=sum) {
         al.add(arr[ind]);
    	 sequence(arr,ind,al,sum-arr[ind]);
    	 al.remove(al.size()-1);
    	 }
    	
    	 sequence(arr,ind+1,al,sum);
    	 
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		 int arr[]=new int[n];
	        for(int i=0;i<n;i++)arr[i]=i+1;
		ArrayList<Integer> al=new ArrayList<>();
		int sum=3;
		sequence(arr,0,al,sum);
	}
}
