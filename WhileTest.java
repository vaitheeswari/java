import java.util.Scanner;
class Whiletest
{
public static void main(String[] arg)
{
int i=1,n,a=0;
System.out.println("enter the number:");
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(i<n)
{
i++;
a=a+i;
}
System.out.println(a);
}
}