package recusion;
import java.util.*;
public class PalindromPartitioning {
     static boolean ispalindrome(int start,int end,String str)
     {
    	 while(start<=end)
    	 {
    		 if(str.charAt(end--)!=str.charAt(start++))
    			 return false;
    		
    		
    	 }
    	 return true; 
     }
     static void palindrom(ArrayList<ArrayList<String>> res,ArrayList<String> al,int ind,String str,int val)
     {
    	 if(ind==str.length())
    	 {
    		 res.add(new ArrayList(al));
    		 return;
    	 }
    	 
    	 for(int i=ind;i<str.length();++i)
    	 {
    		
    		 if(ispalindrome(ind,i,str))
    		 {
    			 al.add(str.substring(ind, i+1));
    			 palindrom(res,al,i+1,str,val);
    			 al.remove(al.size()-1);
    		 }
    			 
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababbbabbababa";
		int i=3;
		ArrayList<ArrayList<String>> res=new ArrayList<>();
		palindrom(res,new ArrayList<String>(),0,str,i);
		System.out.println(res);

	}

}
