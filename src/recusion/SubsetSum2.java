package recusion;

import java.util.*;

public class SubsetSum2 {
	static void sequence(int arr[],int ind,ArrayList<Integer> al,ArrayList<Integer> al2)
    {
   	 if(ind==arr.length)
   	 {
   		al2.add(sum(al));
   		 return;
   	 }
   	 sequence(arr,ind+1,al,al2);
   	 al.add(arr[ind]);
   	 sequence(arr,ind+1,al,al2);
   	 al.remove(al.size()-1);
   	 }
	static int sum(ArrayList<Integer> al)
	{
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum+=al.get(i);
		}
		return sum;
	}
	static void sumisun(int arr[],int ind,int sum)
	
	{
		if(ind==arr.length)
		{
		System.out.println(sum);
		return;
		}
		sumisun(arr,ind+1,sum+arr[ind]);
		sumisun(arr,ind+1,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2};
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		sequence(arr,0,al,al2);
//		Collections.sort(al2);
		System.out.println(al2);
		sumisun(arr,0,0);

}
}
