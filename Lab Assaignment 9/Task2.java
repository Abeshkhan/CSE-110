public class Task2{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    int [] array= new int[10];
    for(int i=0;i<array.length;i++){
      System.out.println("Enter value no 5"+(i+1));
      array[i]=abesh.nextInt();
      
    }
    System.out.println("which number you want");
    int a=abesh.nextInt();
    System.out.println(array[a-1]+ " is the value ");}}