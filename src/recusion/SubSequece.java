package recusion;

import java.util.*;
import java.util.List;

public class SubSequece {
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> arr)
    {
       ArrayList<ArrayList<Integer>> res=new ArrayList<>();
       subsequence(arr,0,new ArrayList(),res);
       return res;
    }
     static void subsequence(ArrayList<Integer> arr,int ind,ArrayList<Integer> al,ArrayList<ArrayList<Integer>> res)
     {
    	 if(ind==arr.size())
    	 {
    		 res.add(new ArrayList<Integer>(al));
    		 return;
    	 }
    	
    	 al.add(arr.get(ind));
    	 subsequence(arr,ind+1,al,res);
    	 al.remove(al.size()-1);
    	 subsequence(arr,ind+1,al,res);
    	 
    	 
     }
     static void sequence(int arr[],int ind,ArrayList<Integer> al)
     {
    	 if(ind==arr.length)
    	 {
    		 System.out.println(al);
    		 return;
    	 }
    	 sequence(arr,ind+1,al);
    	 al.add(arr[ind]);
    	 sequence(arr,ind+1,al);
    	 al.remove(al.size()-1);
    	 
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2};
		ArrayList<Integer> al=new ArrayList<>();
		sequence(arr,0,al);
		ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(3);
        arr2.add(1);
        arr2.add(2);
        System.out.println("second Method");
        System.out.println(subsets(arr2));
	

	}

}
