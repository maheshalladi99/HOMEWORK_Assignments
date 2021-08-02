package demoone;

import java.util.LinkedList;

public class DayTwo {
	public static void main(String[] args) {
		LinkedList<String> lan=new LinkedList<>();
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
