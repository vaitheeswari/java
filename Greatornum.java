import java.util.Scanner;
class Greatornum
{
public static void main(String[],arg)
{
int i,j,k;
Scanner in=new Scanner(System.in);
i=in.nextInt();
j=in.nextInt();
k=in.nextInt();
if(i>k&&i>j)

System.out.println(i+"is greator");
else
{
 if(j>k)
System.out.println(j+"is greator");
else
System.out.println(k+"is greator");
}
}
}