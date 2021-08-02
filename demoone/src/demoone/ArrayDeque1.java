package demoone;

import java.util.HashSet;
import java.util.Set;
import java.util.*; 

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque <String> lan=new ArrayDeque<>();
		lan.add("telugu");
		lan.add("telugu1");
		lan.add("telugu2");
		lan.add("telugu3");
		lan.add("telugu4");
		System.out.println(lan);
		lan.offer("telugu3111");
		lan.offerFirst("telugu41111");
		lan.offerLast("telugu422222");
		System.out.println(lan);
		lan.add("telugu3qwe4");
		lan.add("telugu4ewwdrf");
		System.out.println(lan);
	}
}
