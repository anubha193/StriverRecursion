package recusion;

import java.util.ArrayList;

public class NqueensGfg {
	 static void solve(int n,int cols,int[] left,int[] upper,int lower[],ArrayList<ArrayList<Integer>> res,ArrayList<Integer> al)
	   {
		  if(cols==n)
		  {
			  res.add(new ArrayList<>(al));
			  return;
		  }
		  for(int row=0;row<n;row++)
		  {
			  if(left[row]==0 && lower[cols+row]==0 && upper[n-1+cols-row]==0)
			  {
				 al.add(row+1);
				  left[row]=1;
				 lower[cols+row]=1;
				upper[n-1+cols-row]=1;
				solve(n,cols+1,left,upper,lower,res,al);
				upper[n-1+cols-row]=0;
				lower[cols+row]=0;
				left[row]=0;
				al.remove(al.size()-1);
			  }
		  }
	   }
	   
		public static void main(String[] args) {
			int n=4;
			
			ArrayList<ArrayList<Integer>> res=new ArrayList<>();
			ArrayList<Integer> al=new ArrayList<>();
			int[] left=new int[n];
			int []upper=new int[2*n-1];
			int []lower=new int[2*n-1];
			solve(n,0,left,upper,lower,res,al);
			System.out.println(res);

		}
}
