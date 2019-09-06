import java.util.Scanner;

public class Unspecifiedsum{
    
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
     System.out.println("enter the input");
     String temp;
     int sum=0;
     while(input.hasNext()){
        temp=input.next();
        if(temp.equals("go")){
            break;
        }
        sum=Integer.parseInt(temp)+sum;
       }
          System.out.println(sum);
     input.close();  
    }
     
}