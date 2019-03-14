public class pattern3
{
  public static void main(String args[]){
     java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter row number");
    int r=abesh.nextInt();
    for(int row=1;row<=r;row++){
      for(int spaceCount=1;spaceCount<=r-row;spaceCount++){
        System.out.print("  ");
      }
      for (int columnCount=1;columnCount<=row;columnCount++){
        System.out.print(columnCount);
      }
    System.out.println();}
  }
}


//      1 
//    12 
//  123 
//1234
