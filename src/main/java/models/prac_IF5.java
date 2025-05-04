package models;

public class prac_IF5 {
	public static void main(String[] args) {

		B b = new C();
		A t = new C();
		
		b.test(1);

	}
}

sealed interface A permits C{

	void test(int i);
}

class B {
	public static final int NUM = 2;
}

final class C extends B implements A {
	@Override

	public void test(int i) {
		System.out.print(i * B.NUM);
	}
}