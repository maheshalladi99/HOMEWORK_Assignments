package demoone;



public class Static12 {
	interface Myfirst{
		public void demo();
		public static void todis() {
			System.out.println("this is from static");
		}
	}
	public class intex{
		public void demo() {
			System.out.println("this is from implementation of demo");
		}
	}
	
		public void main(String[] args) {
		intex obj = new intex();
			obj.demo();
			Myfirst.todis();
			
		}
	}


