package recusion;
import java.util.*;
public class NQueenSimple {
   static void solve(char[][] board,int cols,int[] left,int[] upper,int lower[],ArrayList<ArrayList<String>> res)
   {
	  if(cols==board.length)
	  {
		  res.add(construct(board));
		  return;
	  }
	  for(int row=0;row<board.length;row++)
	  {
		  if(left[row]==0 && lower[cols+row]==0 && upper[board.length-1+cols-row]==0)
		  {
			  board[row][cols]='Q';
			  left[row]=1;
			 lower[cols+row]=1;
			upper[board.length-1+cols-row]=1;
			solve(board,cols+1,left,upper,lower,res);
			upper[board.length-1+cols-row]=0;
			lower[cols+row]=0;
			left[row]=0;
			board[row][cols]='.';
		  }
	  }
   }
   static ArrayList<String> construct(char[][] board)
   {
  	 ArrayList<String> res=new ArrayList<>();
  	 for(int i=0;i<board.length;i++)
  	 {
  		 String s = new String(board[i]);
           res.add(s); 
  	 }
  	 return res;
   }
	public static void main(String[] args) {
		int n=4;
		char[][] board=new char[n][n];
		ArrayList<ArrayList<String>> res=new ArrayList<>();
		int[] left=new int[n];
		int []upper=new int[2*n-1];
		int []lower=new int[2*n-1];
		for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
        		board[i][j]='.';
		solve(board,0,left,upper,lower,res);
		System.out.println(res);

	}
}
