package prac;

public class ReverseWord {
public static String reverse(String str)
{
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	return sb.toString();
	
	
}
public static void main(String[] args) {
	System.out.println(reverse("nandan  kumar  is my name"));
}
}
