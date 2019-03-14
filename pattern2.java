public class pattern2{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("enter row number");
    int row=abesh.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      for(int columnCount=1;columnCount<=rowCount;columnCount++){
        System.out.print(columnCount);
      }
    System.out.println();}
  }}



//1 
//12 
//123 
//1234 