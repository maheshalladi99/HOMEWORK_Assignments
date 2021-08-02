package demoone;
import java.util.*;
public class Set1 {
	public static void main(String[] args) {
		Set <String> lan=new HashSet<>();
		lan.add("telugu");
		lan.add("telugu1");
		lan.add("telugu2");
		lan.add("telugu3");
		lan.add("telugu4");
		System.out.println(lan);
		Set <String> lan1=new TreeSet<>();
		lan1.add("telugu");
		lan1.add("telugu1");
		lan1.add("telugu2");
		lan1.add("telugu3");
		lan1.add("telugu4");
		System.out.println(lan1);
		Iterator<String> it=lan1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
