package recusion;
import java.util.*;
public class MColoringProblem {
   static boolean graphColoring(ArrayList < ArrayList<Integer >> G,int[] color,int node,int c)
   {
	   if(node==G.size())
		   return true;
	   for (int i = 1; i <= c; i++) {
           if (isSafe(node, G, color, G.size(), i)) {
               color[node] = i;
               if (graphColoring(G,color,node+1,c) == true) return true;
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
		int N = 4, M = 3;
        ArrayList <ArrayList <Integer > > al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            al.add(new ArrayList());
        }
         al.get(0).add(1);
       al.get(1).add(0);
       al.get(1).add(2);
       al.get(2).add(1);
       al.get(2).add(3);
       al.get(3).add(2);
       al.get(3).add(0);
       al.get(0).add(3);
        al.get(0).add(2);
       al.get(2).add(0);
        int[] color = new int[N];
        boolean ans = graphColoring(al, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    
for(int i=0;i<N;i++)
{
	System.out.print(color[i]+" ");
}
	}
      
	}


