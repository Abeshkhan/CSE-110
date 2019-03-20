package solve;

import java.util.Scanner; 
  
public class Q21{ 
 public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter rows :");
   int rows =sc.nextInt();

        for(int i = 1; i <=rows; i++) {
        	
            for(int space = 1; space <= (rows - i); space++) {
                	System.out.print(" ");
            }
            for(int j=1;j<=(i+(i-1));j++) {
            	if(i==1||i==rows) {
            		System.out.print(j);
            	}
            	else {
            		if(j==1||j==(2*i-1))
            			System.out.print(j);
            		else
            			System.out.print(" ");
            	}
            	}
            	System.out.println();
        }
    }
 }
