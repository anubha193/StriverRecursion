package recusion;
import java.util.*;
public class PrintOnesubSequence {
     static boolean subset(int arr[],int ind,ArrayList<Integer> al,int sum,int s)
     {
    	 if(ind==arr.length)
       	 {
       		 if(s==sum) {
       			 System.out.println(al);
       		 return true;
       		 }
       		 else return false;
       	}
       	
       	 al.add(arr[ind]);
       	 s=s+arr[ind];
       	if( subset(arr,ind+1,al,sum,s)) return true;
       	 al.remove(al.size()-1);
       	 s=s-arr[ind];
       	  if(subset(arr,ind+1,al,sum,s))return true;
       	return false;
       	 
     }
     public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,1};
      int sum=2;
      System.out.println(subset(arr,0,new ArrayList(),sum,0));
     
	}

}
