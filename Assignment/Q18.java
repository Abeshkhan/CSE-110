import java.util.Scanner; 
  
public class Q18 
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
            if(i!=rows-1){
            for(j=0; j<=i; j++) 
            { 
             if (j==0||j==i) 
                System.out.print("* "); 
            else
              System.out.print("  ");
            } 
            }
            else{
            for(j=0; j<=i; j++) 
            {  
                System.out.print("* "); 
            }
            }
              
            System.out.println(); 
        }
 }
}
  