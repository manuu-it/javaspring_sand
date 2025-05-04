package models;

abstract class wk21 {

	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}

	protected abstract void test();

}

class wk22 extends wk21 {
	protected void test() {
		System.out.println("B");
	}
}

public class abstract_Prac2 extends wk22 {
	public static void main(String[] args) {

		wk21 s = new wk22();
		s.sample();

	}
}

// ABC が出力