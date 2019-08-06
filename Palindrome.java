import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
int num=0,rev_no=0,r;
int n=num;
Scanner Scan=new Scanner(System.in);
n=Scan.nextInt();
while(n!=0)
{
r=n%10;
num=n%10;

rev_no=rev_no+r;
}
System.out.print(r);
if(num==rev_no)
System.out.print("Palindrome");
else
System.out.print("Not Palindrome");
}
}
