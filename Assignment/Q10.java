import java.util.Scanner; 
  
public class Q10
{ 
 public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter rows :");
   int rows =sc.nextInt();
        int k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
              
                System.out.print(k+1+" ");
                ++k;
            }

            System.out.println();
        }
    }
}
