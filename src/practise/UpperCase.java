package practise;

public class UpperCase {
public static String upper(String str)
{
	str=str.toUpperCase();
	return str;
}

//static is used before main method
public static void main(String[] args) {
	System.out.println(upper("my name is nandan kumar"));
}
	/*public static void main(String[] args) {
		String s1="nandan";
		System.out.println(s1.toUpperCase());
	}*/
}
