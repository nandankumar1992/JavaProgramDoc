package prac;

import java.util.HashMap;
import java.util.Map;

public class Hashmapp {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer,String>();
	hm.put(1, "nandan");
	hm.put(3, "kumar");
	hm.put(2, "sam");
	hm.put(4, "keerthy");
	
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+  " " +m.getValue());
	}
}
}
