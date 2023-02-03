package recusion;
import java.util.*;
class Pair
{
	int node;
	int weight;
	Pair(int n,int w )
	{
		node=n;
		weight=w;
	}
}
public class GraphRepresentation {
      static void matrix(int[][] matrix,int m,int n)
      {
    	  Scanner sc=new Scanner(System.in);
    	for(int i=0;i<m;i++)
    	{
        System.out.println("enter the node values for "+(i+1)+"th node");
    	System.out.println("enter the value of first node");
    	int first=sc.nextInt();
    	System.out.println("enter the value of second node");
    	int second=sc.nextInt();
    	matrix[first-1][second-1]=1;
        matrix[second-1][first-1]=1;
    	}
    	
      }
      static void  weighted_graph(int m,int n)
      {
    	  ArrayList<ArrayList<Pair>> al=new ArrayList<>();
    	  Scanner sc=new Scanner(System.in);
    	  for(int i=0;i<m;i++)
    	  {
    		  al.add(new ArrayList());
    	  }
    	   for(int i=0;i<m;i++)
    	   {
    		   System.out.println("enter the node values for "+(i+1)+"th node");
    	    	System.out.println("enter the value of first node");
    	    	int first=sc.nextInt();
    	    	System.out.println("enter the value of second node");
    	    	int second=sc.nextInt();
    	    	System.out.println("enter the weight");
    	    	int w=sc.nextInt();
    	    	al.get(first).add(new Pair(second,w));
    	    	al.get(second).add(new Pair(first,w));
    	   }
    	   for (int i = 1; i <= n; i++) { 
   			for (int j = 0; j < al.get(i).size(); j++) { 
   				Pair it=al.get(i).get(j);
   				System.out.print(it.node+" "+it.weight+" "); 
   				System.out.print(",");
   			} 
   			System.out.println(); 
   		}
   		  
      }
      static void linkedList(int m,int n)
      {
    	  ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    	  Scanner sc=new Scanner(System.in);
    	  for(int i=0;i<m;i++)
    	  {
    		  al.add(new ArrayList());
    	  }
    	   for(int i=0;i<m;i++)
    	   {
    		   System.out.println("enter the node values for "+(i+1)+"th node");
    	    	System.out.println("enter the value of first node");
    	    	int first=sc.nextInt();
    	    	System.out.println("enter the value of second node");
    	    	int second=sc.nextInt();
    	    	al.get(first).add(second);
    	    	al.get(second).add(first);
    	   }
    	   for (int i = 1; i <= n; i++) { 
   			for (int j = 0; j < al.get(i).size(); j++) { 
   				System.out.print(al.get(i).get(j)+" "); 
   			} 
   			System.out.println(); 
   		}
   		
   	}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the number of nodes in the Graph=");
     int n=sc.nextInt();
     int[][] matrix=new int[n+1][n+1];
     System.out.println("Enter the number of Edges in the graph=");
     int m=sc.nextInt();
    System.out.println("1-Mtartix Repersentation=");
     System.out.println("2-LinkedListRepresntation");
     System.out.println("3-Weighted graph representation=");
     System.out.println("Enter your Choice");
     int c=sc.nextInt();
     switch(c)
     {
     case 1:
    	 matrix(matrix,m,n);
    	 System.out.println("the ouput matrix is=");
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=0;j<n;j++)
    		 {
    			 System.out.print(matrix[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
    	 break;
     case 2:
    	 linkedList(m,n);
    	 break;
     case 3:
    	 weighted_graph(m,n);
    	 break;
     default:
    	 System.out.println("wrong choice");
    	 
     }
	}

}
