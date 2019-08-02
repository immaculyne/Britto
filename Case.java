class Case{
public static void main(String args[]){
int i;
int f=0;
int x=10,y=20,z=7;
for(i=x;i<=y;i++)
{
if(i%z==0)
{
f=i;
break;
}
}
for(i=f;i<=y;i=i+z)
{
System.out.println(i);
}
}
}