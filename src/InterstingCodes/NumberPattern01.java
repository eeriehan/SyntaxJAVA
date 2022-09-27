package InterstingCodes;

public class NumberPattern01 {

	public static void main(String[] args) {
		//copied :https://www.javatpoint.com/how-to-print-pattern-in-java
		  int i, j, rows=7;  
		  //Prints upper half  pattern  
		  for (i = rows; i >= 1; i--) {  
		    for (j = 1; j <= i; j++) {  
		      System.out.print(j+" ");  
		    }  
		      System.out.println();  
		  }  

		    //Prints lower half  pattern  
		  for (i = 2; i <= rows; i++) {  
		    for (j = 1; j <= i; j++) {  
		      System.out.print(j+" "); 
		    }  
		      System.out.println();  
		  }
	}

}
