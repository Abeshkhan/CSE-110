public class Task3{
public static void main(String args[]){
  java.util.Scanner abesh=new java .util.Scanner (System.in);
  int [] array= new int[10];
  for(int i=0;i<array.length;i++){
    System.out.println("Enter your number");
    array[i]=abesh.nextInt();
   
  }
  System.out.println("reverse order : ");
  for(int j=9;j>=0;j--){
   System.out.print (array[j] +" ");
}
}}