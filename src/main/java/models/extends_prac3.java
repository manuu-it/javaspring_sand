package models;

class A3 {
	public void hello() {

		System.out.print("HELLO:A");
	}
}

class B3 extends A3 {
	public void hello() {

		System.out.print("HELLO");
	}
}

public class extends_prac3 {
	public static void main(String[] args) {

		A3 a = new A3();
		B3 b=(B3)a;
		b.hello();

	}
}

/*
上記実行↓
Exception in thread "main" java.lang.ClassCastException: class models.A3 cannot be cast to class models.B3 (models.A3 and models.B3 are in unnamed module of loader 'app')
	at models.extends_prac3.main(extends_prac3.java:21)
キャスト変換エラー


*/