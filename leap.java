import java.util.Scanner;
class leap
{
public static void main(String[] arg)
{
 int a;
Scanner in=new Scanner(System.in);
System.out.println("enter the year:);
if(a%4==0||a%400==0)
System.out.println("the given year is leap year");
else
System.out.println("the given year is not leap year");
}
}