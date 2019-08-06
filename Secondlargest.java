import java.util.Arrays;
public class Secondlargest{
public static int getSecondlargest(int[]a,int total){
Arrays.sort(a);
return a[total-2];
}
public static void main(String args[]){
int a[]={42,64,73,78,930,398};
System.out.print("Second Largest="+getSecondlargest(a,6));
}
}
