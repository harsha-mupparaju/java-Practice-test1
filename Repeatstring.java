import java.util.Scanner;

public class Repeatstring{

     public static void main(String[] args) {
         String str1="";
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String str=input.next();
        System.out.println("enter the number");
        int num=input.nextInt();
 if(str.length()<num)
 System.out.println("select smaller num or bigger string");
else{
        for(int i=str.length()-num;i<str.length();i++)
        {   
            str1=str1+str.charAt(i);
        }
        while(num!=0){
            str=str+str1;
            num--;
        }
        System.out.println(str);
    }
        input.close();
     }
}