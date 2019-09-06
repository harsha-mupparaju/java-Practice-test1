import java.util.Scanner;

public class Character{

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
     System.out.println("enter the Character");
     char ch=input.next().charAt(0);
   
           if(ch>='a'&& ch<='z')
           System.out.println("lower-case alphabet");
           else if(ch>='A'&& ch<='Z')
           System.out.println("Upper-case alphabet");
           else if(ch>='0'&&ch<='9')
           System.out.println("number");
           else 
           System.out.println("special character");
    input.close();
    }

}