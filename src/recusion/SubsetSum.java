package recusion;

import java.util.ArrayList;

public class SubsetSum {
	static void sequence(int arr[],int ind,ArrayList<Integer> al,int sum,int s)
    {
   	 if(ind==arr.length)
   	 {
   		 if(s==sum) {
   		 System.out.println(al);
   		 }
   		return;
   	 }
   	
   	 al.add(arr[ind]);
   	 s=s+arr[ind];
   	 sequence(arr,ind+1,al,sum,s);
   	 al.remove(al.size()-1);
   	 s=s-arr[ind];
   	 sequence(arr,ind+1,al,sum,s);
   	 
   	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,0,1,2,3};
		ArrayList<Integer> al=new ArrayList<>();
		sequence(arr,0,al,4,0);
		
	

	}

}
