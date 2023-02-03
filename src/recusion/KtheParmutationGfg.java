package recusion;
import java.util.*;
public class KtheParmutationGfg {
	 static void parmute(int n,boolean[] flag,ArrayList<String> res,ArrayList<Integer> al)
     {
   	  if(al.size()==n)
   	  {
   		  String str="";
   		  for(int i=0;i<al.size();i++)
   			  str=str+""+al.get(i);
   		  res.add(str);
   	  }
   	  for(int i=0;i<n;i++)
   	  {
   		  if(flag[i]==false)
   		  {
   			 flag[i]=true;
   			 al.add(i+1);
   			 parmute(n,flag,res,al);
   	     al.remove(al.size()-1);
   			 flag[i]=false;
   		  }
   	  }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		ArrayList<String> res=new ArrayList<>();
		boolean[] flag=new boolean[4];
		parmute (n,flag,res,new ArrayList());
		Collections.sort(res);
		System.out.println(res.get(3));
		
		}

}
