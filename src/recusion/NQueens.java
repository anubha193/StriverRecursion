package recusion;

import java.util.*;

public class NQueens {
     static void solve(char[][] board,int cols,ArrayList<ArrayList<String>> res)
     {
    	 if(cols==board.length)
    	 {
    		 res.add(construct(board));
    		 return;
    	 }
    	 for(int row=0;row<board.length;row++)
    	 {
    		 if(isSafe(board,cols,row))
    		 {
    			 board[row][cols]='Q';
    			 solve(board,cols+1,res);
    			 board[row][cols]='.';
    		 }
    	 }
     }
     static boolean isSafe(char[][] board,int col,int row)
     {
    	  int duprow = row;
          int dupcol = col;
          while (row >= 0 && col >= 0) {
              if (board[row][col] == 'Q') return false;
              row--;
              col--;
          }

          row = duprow;
          col = dupcol;
          while (col >= 0) {
              if (board[row][col] == 'Q') return false;
              col--;
          }

          row = duprow;
          col = dupcol;
          while (col >= 0 && row < board.length) {
              if (board[row][col] == 'Q') return false;
              col--;
              row++;
          }
          return true;
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
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		char[][] board=new char[n][n];
		for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
		ArrayList<ArrayList<String>> res=new ArrayList<>();
		solve(board,0,res);
		System.out.println(res);
		

	}

}
