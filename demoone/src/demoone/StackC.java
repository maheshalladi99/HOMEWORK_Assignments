package demoone;
import java.util.*;
public class StackC {
	public static void main(String[] args) {
		Stack <String> n=new Stack<>();
		n.push("a");
		n.push("b");
		n.push("c");
		n.push("d");
		n.push("e");
		n.push("f");
		n.pop();
		System.out.println(n.empty());
		
	}
}
