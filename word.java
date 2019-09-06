import java.util.Scanner;


public class word{
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    System.out.println("Enter the word");
    String str=input.next();
    
  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
      System.out.print("vowel  ");
    else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
     System.out.print("consonant ");
     else
     System.out.print("error ");
  }
  input.close();
}
}

