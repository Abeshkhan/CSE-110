/**
  * Java program that asks the user for 20 numbers and prints if those numbers are odd or even
  * Java program that asks the user for a quantity , then takes that many numbers and prints if those numbers are odd or even
  *
  */
  public class Classwork8and9{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
     System.out.println("enter quantity");
    int q=abesh.nextInt();
    for (int i=1;i<=q;i++){
    int a = abesh.nextInt();
    if (a%2==0){
      System.out.println("even");}
    else if (a%2!=0){
      System.out.println("odd");
    }
    }
  }
}
     