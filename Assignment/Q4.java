import java.util.Scanner; 
  
public class Q4 
{ 
 public static void main(String[] args) {
   
   Scanner sc =new Scanner(System.in);
   
   System.out.println("Enter rows :");
    int rows = sc.nextInt();
    System.out.println("Enter coloums :");
    int coloums = sc.nextInt();
    
    for(int i =1; i<=rows; i++){
      for(int j=1; j<=coloums; j++){
      System.out.print(j);
      }
    System.out.println();
    
    
    }
   
   
   
    }
}
