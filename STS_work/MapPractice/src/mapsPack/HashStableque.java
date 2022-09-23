package mapsPack;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;


public class HashStableque {

	public static void main(String[] args) {
Hashtable<Integer, String> ht = new Hashtable<>();

ht.put(100,"Amit");
ht.put(102,"Ravi");
ht.put(101,"Vijay");
ht.put(103,"Rahul");

Set<Map.Entry<Integer, String>> set =   ht.entrySet();

for(Map.Entry<Integer, String> i:set) {
	System.out.println(i);
}
	}

}
