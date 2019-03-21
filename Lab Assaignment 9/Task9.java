public class Task9{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    int [] array= new int[10];
    for(int i=0;i<array.length;i++){
      array[i]=abesh.nextInt();  // getting numbers from user 
    }
    int num=abesh.nextInt();  // getting another new number from the fuckin user mofo
    for(int j=0;j<array.length;j++){
      if(num==array[j]){
        System.out.println ("YES");
        break;}
     if(num!=array[j]){
       System.out.println("NO");
     break;}
    }}}
    
  