package recusion;

import java.util.ArrayList;

public class CountSubsequenceOfGivenSum {
	static int sequence(int arr[],int ind,int sum,int s)
    {
   	 if(ind==arr.length)
   	 {
   		 if(s==sum) {
   		 return 1;
   		 }
   		 else return 0;
   	 }
   	
   	
   	 s=s+arr[ind];
   	 int l=sequence(arr,ind+1,sum,s);
   
   	 s=s-arr[ind];
   	
   	 int r=sequence(arr,ind+1,sum,s);
   	 return l+r;
   	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1};
		
		System.out.println(sequence(arr,0,2,0));
	

	}

}
