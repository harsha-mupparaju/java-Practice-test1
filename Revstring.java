import java.util.Scanner;
public class Revstring{

public static void main(String[] args) {
    String str1="";
     Scanner input=new Scanner(System.in);
     System.out.println("enter the string");
     String str=input.next();
   
 for(int i=str.length()-1;i>=0;i--){
     str1=str1+str.charAt(i);
 }
System.out.println(str1);
    input.close();
}
}