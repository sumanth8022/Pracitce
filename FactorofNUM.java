package com.pack;

public class FactorofNUM {

	public static void main(String[] args) {
		      int num = 100;

		     System.out.println( "Factors of " + num + " are " );

		     // finding and printing factors b/w 1 to num
		     for(int i = 1; i <= (num/2); i++)
		     {
		         if(num % i == 0)
		             System.out.println(i + " "); 
		     }
		     System.out.println(num);

		      
		 

	}

}
