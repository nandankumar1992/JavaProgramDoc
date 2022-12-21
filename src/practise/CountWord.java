package practise;

public class CountWord {
public static void main(String[] args) {
	String sentence="my name is nandan kumar";
	int wordcount=0;
	
	for(int i=0;i<sentence.length()-1;i++)
	{
		if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i>0))
		{
			wordcount++;
		}
	  
	}
	wordcount++;
	System.out.println("total number of word " +wordcount);
}
}
