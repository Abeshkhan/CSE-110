public class pattern4{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter row quantity");
    int row=abesh.nextInt();
    System.out.println("Enter column number ");
    int column=abesh.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      for(int columnCount=1;columnCount<=column;columnCount++){
        if(rowCount==1||rowCount==row||columnCount==1||columnCount==column){
          System.out.print(column);}
        else
          System.out.print(" ");}
          System.out.println();}       
    }
  }

//            55555  
//            5   5
//            5   5
//            5   5
//            55555
