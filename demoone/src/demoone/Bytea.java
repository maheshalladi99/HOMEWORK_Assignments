package demoone;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Bytea {
	public static void main(String[] args) {
		ArrayList<Integer> cars = new ArrayList<Integer>();
	    cars.add(1);
	    cars.add(2);
	    cars.add(3);
	    cars.add(4);
	    for(Integer int1:cars) {
	    	System.out.println(int1);
	    }
	    cars.forEach(n->System.out.println(n));
	    
	    Consumer<Integer> method =(a) ->{a*=2;
	    System.out.println(a);};
	    cars.forEach(a->System.out.println(a));
	    
	    
	}
 
}
