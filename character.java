import java.util.Scanner;
class character
{
public static void main(String[] arg)
{
 int a;
Scanner in=new Scanner(System.in);
System.out.println("enter the character:);
if((a>='a'&&a<="z")||(a>='A'&&a<='Z'))
System.out.println("the given character is present");
else
System.out.println("the given character is not present");
}
}