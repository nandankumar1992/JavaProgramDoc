package practise;

public class PrimeNumber {
public static void main(String[] args) {
	int number=3;
	int temp=0;
	
	for(int i=2; i<number;i++)
	{
		if(number%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp == 0)
	{
		System.out.println("prime number is " +number);
	}
	else
	{
		System.out.println("prime number is not " +number);
	}
}
}
