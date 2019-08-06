import java.util.Arrays;
public class Small{
public static int smallest(int[]a,int total){
Arrays.sort(a);
return a[0];
}
public static void main(String args[]){
int a[]={22,33,45,1,87};
System.out.print("Smallest Element="+smallest(a,5));
}
}






