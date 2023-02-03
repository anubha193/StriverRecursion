package recusion;
import java.util.*;
public class Subset1 {
     static void sum(int arr[],ArrayList<Integer> al,ArrayList<ArrayList<Integer>> res,int ind)
     {
    	res.add(new ArrayList(al));
    	for(int i=ind;i<arr.length;i++)
    	{
    		if(i>ind && arr[i]==arr[i-1])continue;
    		al.add(arr[i]);
    		sum(arr,al,res,i+1);
    		al.remove(al.size()-1);
    		
    	}
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,2};
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        sum(arr,al,res,0);
        System.out.println(res);
        
	}

}
