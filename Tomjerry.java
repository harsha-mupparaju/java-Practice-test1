import java.util.Scanner;

public class Tomjerry{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        if(num%2==0 && num>20 && num<30)
        System.out.println("Jerry");
        else if(num%2!=0 && num>20 && num<30)
        System.out.println("Tom");
        else
        System.out.println("Unwanted Input");
        input.close();
    }
}