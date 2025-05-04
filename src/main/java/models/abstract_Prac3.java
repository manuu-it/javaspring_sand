package models;

class wk31 {

	String A="A";
	//abstract_Prac2　を抽象クラスではないように修正し、に実行
	public void sample3() {
		System.out.println(A);
		test();
		System.out.println("C");
	}

	protected void test() {
		System.out.println("D");
	}

}

class wk32 extends wk31 {
	protected void test() {
		System.out.println("B");
	}

}

public class abstract_Prac3 extends wk22 {
	public static void main(String[] args) {

		wk31 s = new wk32();
		s.sample3();         //ABCが呼ばれる。
							 //wk31クラスのsample()を参照→sample()内で呼ばれるtest()はwk32クラスでオーバーライドしているため、動的ディスパッチによりwk32クラスの方が呼び出される。

	}
}

//public class abstract_Prac3 extends wk22 {
//	public static void main(String[] args) {
//
//		wk31 s = new wk31();
//		s.sample3();         //ADCが呼ばれる。（wk31クラスしか参照していない）
//
//	}
//}

/*

A
B
C
が出力

オーバーライドされている場合、インスタンス生成した型のメソッドを参照する。
インスタンス生成した型のクラスに該当メソッドが存在しない場合、継承したクラスを参照する。
 */