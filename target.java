import java.util.Scanner;

public class target{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the target");
        int target=input.nextInt();
        System.out.println("enter the number");
         int num=input.nextInt(); 
     while(num!=target){
        if(num<0)
        System.out.println("lesser than the lower limt");
        else if(num>50)
        System.out.println("greater than the upper limit");
        else{
            if(num<target)
            System.out.println("lesser than target");
            else if(num>target)
            System.out.println("greater than target");
             }
            int n1=input.nextInt();
            num=n1; 
            }
    System.out.println("input matches the target");
       input.close();        
    }
}