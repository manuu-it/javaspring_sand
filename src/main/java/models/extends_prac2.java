package models;

class A2 {

}

class B2 extends A2 {
	public void hello() {

		System.out.print("B");
	}
}

class D extends B2 {
	@Override
	public void hello() {

		System.out.print("D");
	}
}

public class extends_prac2 extends B2 {
	public static void main(String[] args) {

		test(new D());

	}

	private static void test(A2 a) {
		if (a instanceof B2) {

			B2 b = (B2) a;
			b.hello();
		}
	}
}

/*
動的ディスパッチ（Dynamic Dispatch）:
オーバーライドされたメソッドの選択が、実行時のオブジェクトの型によって決定される仕組み

→つまり、上記ではDクラスのメソッドを参照する。
→Dが出力される。



*/