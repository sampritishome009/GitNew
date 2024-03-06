package Arrays;

import java.util.Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a[]={5,2,4};
		
		int a[]= {20, 30, 25, 35, -16, 60, -100};
		
		int sum=0;
		double avg=0;
		
		//System.out.println(a[1][0]);
		
	 //   for(int[] row:a) {//converting each row to a string and then printing each row in a seperate line
	   // 	System.out.println(Arrays.toString(row));
	    	
	    for(int i:a) {
	    	sum+=i;
	    	  avg=sum/a.length;
	    	
	    }
	  
	    
		System.out.println("The sum is " + sum);
		System.out.println("The avg is " + avg);
		
		
		
	}
	

}
	
