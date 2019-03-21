public class Task4{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    int [] array= new int [10];
    for(int i=0;i<array.length;i++){
      array[i]=abesh.nextInt();
    }
    for(int j=0;j<array.length;j++){
      if(array[j]%2!=0){
      System.out.println("first odd number is " +array[j]);
      break;}
    }}}