import java.util.Scanner;

public class Palindrome{
 public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("enter the number");
     int number=input.nextInt();
     int temp,r;int sum=0;int sum2=0;
     temp=number;
     while(number>0)
     { r=number%10;
       if(r%2==0)
        sum2=sum2+r;
        sum=(sum*10)+r;
        number=number/10;
     }
     if(temp==sum){
         System.out.println("sucess:palindrome");
      
         if(sum2>25)
         System.out.println("success :sum");
         else
         System.out.println("failure :sum");
      }
     else  
     System.out.println("failure:not a palindrome"); 
    input.close();
 }
}