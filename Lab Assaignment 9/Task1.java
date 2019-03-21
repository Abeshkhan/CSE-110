public class Task1{
  public static void main (String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    int sum=0;
    int [] tn=new int[3];
    for(int i=0;i<tn.length;i++){
      tn[i]=abesh.nextInt();
      sum=sum+tn[i];
    }
    System.out.println(sum);
    System.out.println ("numbers were :");
    for(int i=0;i<tn.length;i++){
    System.out.print(tn[i]+" ");
  }
  }}