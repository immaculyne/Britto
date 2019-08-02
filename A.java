import java.util.Scanner;
class A{
public static void main(String args[]){
int n=0,i=0,fact=1;
Scanner Scan=new Scanner(System.in);
n=Scan.nextInt();
//fact=1;
for(i=1;i<=n;i=i+1)
{
fact=fact*i;
}
System.out.println("Factorial="+fact);
}
}