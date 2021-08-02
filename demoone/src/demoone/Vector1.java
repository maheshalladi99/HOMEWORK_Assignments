package demoone;

import java.util.LinkedList;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> lan=new Vector<>();
		lan.add("telugu");
		lan.add("telugu1");
		lan.add("telugu2");
		lan.add("telugu3");
		lan.add("telugu4");
		System.out.println(lan);
		String s=lan.get(1);
		System.out.println(s);
		String s1=lan.remove(1);
		System.out.println(s1);
		}
}
