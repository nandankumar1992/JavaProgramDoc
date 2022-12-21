package practise;

import java.util.Hashtable;
import java.util.Map;

public class HashTablee {
public static void main(String[] args) {
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
ht.put(1, "nandan");
ht.put(2, "kumar");
ht.put(3, "shankar");
ht.put(4, "prasad");

for(Map.Entry m:ht.entrySet())
{
	System.out.println(m.getKey()+ " " +m.getValue());
}
}
}
