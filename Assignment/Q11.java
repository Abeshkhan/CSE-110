import java.util.Scanner; 
  
public class Q11 
{ 
 public static void main(String[] args) {
   
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter rows :");
   int rows =sc.nextInt();
   
          int i, j, k; 
          
        for(i=0; i<rows; i++) 
        { 
            for(j=2*(rows-i); j>=0; j--) 
            { 
                System.out.print(" "); 
            } 
             int num=rows-i;
            for(j=0; j<=i; j++) 
            { 
                System.out.print(num+" ");
                num++;
            } 
              
            System.out.println(); 
        }
 }
}
  