import java.util.Arrays;
public class Largest{
public static int getLargest(int[]a,int total){
Arrays.sort(a);
return a [total-1];
}
public static void main(String args[]){
int a[]={22,34,73,99,738};
System.out.print("Largest="+getLargest(a,5));
}
}
