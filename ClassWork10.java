
/**
  * Java program that asks the user for a quantity , then takes that many numbers and prints 
  * the maximum, minimum and average of those numbers. 
  *
  */
public class ClassWork10 {
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    double sum=0;
    System.out.println("Enter quantity ");
    int q=abesh.nextInt();
      System.out.println("Enter number");
    int a =abesh.nextInt();
    int max=a;
    int min=a;
    double avg=0;
   
      sum=sum+a;
    for (int i =0;i<=q-2;i++){
      System.out.println("Enter number");
      i = abesh.nextInt();
      if (max<i){
        max=i;}
      if (min>i){
        min=i;}
      sum=sum+i;}
    avg=sum/q;
      System.out.println("maximum number is "+max);
      System.out.println("minimum number is"+min);
      System.out.println("average is "+avg);
  }}
        
      
      
      