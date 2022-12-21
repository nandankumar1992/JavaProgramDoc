package practise;

public class ReverseStringg {
public static String reverse(String str)
{
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	return sb.toString();
}

public static void main(String[] args) {
	System.out.println(reverse("my name is nandan kumar"));
}

}
