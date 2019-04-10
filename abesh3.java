import java.util.Scanner;
public class abesh3{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("quantity dee shaala");
    int quantity=in.nextInt();
    double average;
    int array[]=new int[quantity];
    for(int i=0;i<array.length;i++){
      System.out.println("number de");
      array[i]=in.nextInt();
    }
    
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]>array[j]){
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
       System.out.print(array[i]+" ");
    }
   System.out.println();
    if(quantity%2==0){
      average=((array[quantity/2]+array[quantity/2-2]+array[quantity/2-1]+array[quantity/2+1])/4.0);
      System.out.println(average);
    }
    else{
      average=((array[quantity/2]+array[quantity/2+1]+array[quantity/2-1])/3.0);
     System.out.println(average); 
    }
  }
}

      