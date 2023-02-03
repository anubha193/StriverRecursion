package recusion;
import java.util.*;
public class ParmutationOfArrayOfNumber {
      static void parmute(int[] arr,boolean[] flag,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> al)
      {
    	  if(al.size()==arr.length)
    	  {
    		  res.add(new ArrayList(al));
    		  return;
    	  }
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  if(flag[i]==false)
    		  {
    			 flag[i]=true;
    			 al.add(arr[i]);
    			 parmute(arr,flag,res,al);
    	     al.remove(al.size()-1);
    			 flag[i]=false;
    		  }
    	  }
      }
      static void removeDuplicates(ArrayList<ArrayList<Integer>>  al)
  	{
  		HashSet<String> hs=new HashSet<>();
  		
  		hs.addAll(new ArrayList(al));
  		al.clear();
  		al.addAll(new HashSet(hs));
  		
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1};
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		boolean[] flag=new boolean[arr.length];
		parmute(arr,flag,res,new ArrayList());
		removeDuplicates(res);
		
		System.out.println(res);
		
		}

}
