package recusion;
import java.util.*;
public class McoloringLeetcode {
	public static int[] gardenNoAdj(int n, int[][] paths) {
	     int m= 4; 
	       ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
	       int[] color= new int[n];
	        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
	        for(int i=0;i<paths.length;i++){
	            adj.get(paths[i][0]-1).add(paths[i][1]-1);
	            adj.get(paths[i][1]-1).add(paths[i][0]-1);
	        }
	        solve(adj,color,0,m);
	        return color;
	    }
	    static boolean solve(ArrayList < ArrayList<Integer >> G,int[] color,int node,int c)
	   {
		   if(node==G.size())
			   return true;
		   for (int i = 1; i <= c; i++) {
	           if (isSafe(node, G, color, G.size(), i)) {
	               color[node] = i;
	               if (solve(G,color,node+1,c) == true) return true;
	               color[node] = 0;
	           }
	       }
	       return false;

	  }
	   static boolean isSafe(int node, ArrayList<ArrayList< Integer> >G, int[] color, int n, int col) {
	       for (int it: G.get(node)) {
	           if (color[it] == col) return false;
	       }
	       return true;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
           int[][] adj=new int[n+1][n+1];
           adj[1][2]=1;
           adj[2][1]=1;
           adj[2][3]=1;
           adj[3][2]=1;
           adj[3][1]=1;
           adj[1][3]=1;
           int [] color= gardenNoAdj(n,adj);
           for(int i=0;i<n;i++)
           {
        	   System.out.print(color[i]+" ");
           }
           
        	   
	}

}
