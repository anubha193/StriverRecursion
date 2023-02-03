package recusion;

public class ReverseAnArray {
      static void reverse(int arr[])
      {
    	  int j=arr.length-1;
    	 for(int i=0;i<arr.length/2;i++)
    	 {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    	j--;
    	 }
      }
      static void func(int arr[],int l,int r)
      {
    	  if(l>=r)
    		  return;
    	  swap(arr,l,r);
    	  func(arr,l+1,r-1);
    		  
      }
      static void swap(int[] arr,int i,int j)
      {
    	  int temp=arr[i];
      	arr[i]=arr[j];
      	arr[j]=temp;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,2};
       System.out.println("Original Array");
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
      func(arr,0,arr.length-1);
       System.out.println("\nafter Reverse");
       for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
	}

}
