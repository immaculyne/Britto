import java.util.Scanner;
class Amstrong{
public static void main(String args[]){
int c=0,a,temp;
int n;
Scanner Scan=new Scanner(System.in);
n=Scan.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.print("Amstrong");
else
System.out.print("Not Amstrong");
}
}
