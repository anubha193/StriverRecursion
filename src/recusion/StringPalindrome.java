package recusion;

public class StringPalindrome {
      static boolean check(String str,int i,int j)
      {
    	  if(i>=j)
    		  return true;
    	  if(str.charAt(i)!=str.charAt(j))
    		  return false;
    	  
    	  return check(str,i+1,j-1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "neha";
		if(check(str,0,str.length()-1))
				System.out.println("Yes! I am Palindrome");
		else
			System.out.println("No! I am not Palindrome");
			
         
	}

}
