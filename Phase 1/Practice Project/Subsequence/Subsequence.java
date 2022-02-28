package Ass3;

public class Subsequence {
	  public static void main(String args[]){
	      int arr[] = { 20, 15, 44, 55, 71, 52, 54,60,50,77,78 };
	      int arr_length = arr.length;
	      System.out.println("The length of longest Increasing subsequence is: "+ incre_subseq(arr, arr_length));
	   }
	  static int incre_subseq(int my_arr[], int arr_length){
	      int seq_arr[] = new int[arr_length];
	      int i, j, max = 0;
	      
	      for (i = 0; i < arr_length; i++)
	      {
	         seq_arr[i] = 1;
	      }
	      
	      for (i = 1; i < arr_length; i++) 
	      {
	    	  for (j = 0; j < i; j++) 
	    	  {
	    		  if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	    		  {
	    			  seq_arr[i] = seq_arr[j] + 1;
	    		  }
	    	  }
	      }
	      for (i = 0; i < arr_length; i++)
	      {
	      if (max < seq_arr[i])
	      {
	      max = seq_arr[i];
	      }
	      }
	      return max;
	      
	   }
	 
}
