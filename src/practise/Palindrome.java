package practise;

public class Palindrome {
public static void main(String[] args) {
	int number=12321;
	int temp=number;
	int rev=0;
	int rem;
	
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	if(number==rev)
	{
		System.out.println("palindrome number is " +number);
	}
	else
	{
		System.out.println("palindrome number is " +number);
	}
}
}
