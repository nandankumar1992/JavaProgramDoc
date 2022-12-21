package practise;
import java.util.*;  
public class TestArray{  
 public static void main(String args[]){  
  int a[]= {40,76,65,32,12};
  Arrays.sort(a);
  int arrayLength=a.length;  
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);

 }
 System.out.println("the length of the array is "+arrayLength);
 }  
}  