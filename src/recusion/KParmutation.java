package recusion;
import java.util.*;
public class KParmutation {
   static String parmute(int n,int k)
   {
	   int fact = 1;
       ArrayList < Integer > numbers = new ArrayList < > ();
       for (int i = 1; i < n; i++) {
           fact = fact * i;
           numbers.add(i);
       }
       numbers.add(n);
       String ans = "";
       k = k - 1;
       while (true) {
           ans = ans + "" + numbers.get(k / fact);
           numbers.remove(k / fact);
           if (numbers.size() == 0) {
               break;
           }

           k = k % fact;
           fact = fact / numbers.size();
       }
       return ans;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number=");
         int n=sc.nextInt();
         System.out.println("enter the value of k=");
         int k=sc.nextInt();
        String str=parmute(n,k);
        System.out.println(str);
	}

}
