import java.util.Scanner; 
  
public class Q15 
{ 
 public static void main(String[] args) {
   
   Scanner sc =new Scanner(System.in);
   
   System.out.print("Enter rows :");
    int rows = sc.nextInt();
    System.out.print("Enter coloums :");
    int coloums = sc.nextInt();
    
    for(int i =1; i<=rows; i++){
      if(i==1 || i==rows){
      for(int j=1; j<=coloums; j++){
      System.out.print(j);
      }
      }
      else{
      for(int j=1; j<=coloums; j++){
        if(j==1 || j==coloums)
      System.out.print(j);
        else
          System.out.print(" ");
      }
      }
    System.out.println();
    
    
    }
   
   
   
    }
}
