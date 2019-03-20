import java.util.Scanner; 
  
public class Q8 
{ 
 public static void main(String[] args) {
   
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter rows :");
   int rows =sc.nextInt();
   
          int i, j; 
  
        for(i=0; i<rows; i++) 
        { 
          
            for(j=2*(rows-i); j>=0; j--) 
            { 
                System.out.print(" "); 
            } 
             
            for(j=0; j<=i; j++) 
            { 
                System.out.print(j+1+" "); 
            } 
              
            System.out.println(); 
        }
 }
}
  