package hello;

public class Hello {
	public static void main(String[] args) {
		//call by value
		int a = 8;
		int b = a;
		a = a + 4;
		b = b + 8;
		System.out.println(a);
		System.out.println(b);
		
		int c = 24;
		fun(c);
		gun(c);
		System.out.println(c);
	}
	
	public static void fun(int d) {
		d = d + 6;
		System.out.println(d);
	}
	
	public static void gun(int c) {
		c = c + 6;
		System.out.println(c);
	}
	
}
