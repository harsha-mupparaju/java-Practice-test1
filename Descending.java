import java.util.Scanner;

 public class Descending{
 
    public static void main(String[] args) {

    int temp;int sum=0;
    Scanner input=new Scanner(System.in);
     System.out.println("enter the array size");
     int num=input.nextInt();
     int[] array=new int[num];
     for(int i=0;i<num;i++){
         array[i]=input.nextInt();
     }
     for (int i = 0; i < array.length; i++) {     
        for (int j = i+1; j < array.length; j++) {     
           if(array[i] < array[j]) {    
               temp = array[i];    
               array[i] = array[j];    
               array[j] = temp;    
           }     
        }     
    }  
    System.out.println("Elements of array sorted in descending order: ");  
    for (int i = 0; i < array.length; i++) {     
        System.out.print(array[i]+" ");  
        if(array[i]%2==0)
        {  sum=sum+array[i]; } 
      }
      
      if(sum>15)
      System.out.println("true"+" "+"sum is"+sum);
      else
      System.out.println("false"+" "+"sum is: "+sum);
     
      input.close();
    }
}

 