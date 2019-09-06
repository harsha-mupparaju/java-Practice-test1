import java.util.Scanner;

 public class Descending2{
 
    public static void main(String[] args) {

    int temp;int sum=0;int count=0;int num1;
    Scanner input=new Scanner(System.in);
     System.out.println("enter the number");
     int num=input.nextInt();
     num1=num;
     while(num>0){
         num=num/10;
         count++;
     }
   //  System.out.println(count);

     int[] array=new int[count];

     for(int i=count-1;i>=0;i--){
         array[i]=num1%10;
         num1=num1/10;
        // System.out.print(array[i]);
     }
     for (int i = 0;i<count;i++) {     
        for (int j = i+1; j < count; j++) {     
           if(array[i] < array[j]) {    
               temp = array[i];    
               array[i] = array[j];    
               array[j] = temp;    
           }     
        }     
    }  
    for(int i=0;i<count;i++){
        System.out.print(array[i]);}
  
    for(int i=0;i<count;i++){
        if(array[i]%2==0)
        {  sum=sum+array[i]; } 
      }
      
      if(sum>15)
      System.out.println("  true-"+" "+"sum is:"+sum);
      else
      System.out.println("false"+" "+"sum is: "+sum);
      
      input.close();
    }
}

 