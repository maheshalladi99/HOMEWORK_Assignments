package demoone;

public class Interface11 {
	
	interface Myfirst{
		public static int num=234;
		public default void todis() {
			System.out.println("this is from inrterface");
		}
	}
	public static class Myfirstex implements Myfirst{
		public static void main(String[] args) {
			Myfirstex obj = new Myfirstex();
			obj.todis();
			
		}
	}
	

}
