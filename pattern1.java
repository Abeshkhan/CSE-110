public class pattern1{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter row quantity");
    int row=abesh.nextInt();
    System.out.println("Enter column number ");
    int column=abesh.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      for(int columnCount=1;columnCount<=column;columnCount++){
        System.out.print(columnCount);
      }
      System.out.println();
    }
  }}