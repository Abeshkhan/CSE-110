public class Task8{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    int [] array=new int[10];
      for(int i=0;i<array.length;i++){
      array [i]=abesh.nextInt();
    }
      System.out.println("even numbers in reverse order :");
    for(int j=9;j>=0;j--){
      if(array[j]%2==0){
      System.out.print( array[j]+ " ");
      }}}}