package models;

public interface prac_IF {
	default String toString() {
		return "This is a default string from MyInterface.";
	}
}

class MyClass implements prac_IF {
	// 何も定義しない
}

class IF {
	public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.toString()); // どちらの toString() が呼ばれるべきか？
	}
}
/*
 * この例では、MyClass は Object から toString() を継承しており、
 * 同時に MyInterface からもデフォルトの toString() を継承している（と仮定した場合）。
 * どちらの toString() が実行されるべきかという曖昧さが生じます。
 * Javaの設計は、このような曖昧さを避けるようにできています。
 * 
 * 結論として、java.lang.Object のメソッドをデフォルトメソッドでオーバーライドできないのは、
 * Object がすべてのクラスの祖先であるクラスであり、
 * デフォルトメソッドがインターフェースの機能であるというJavaの基本的な構造と、継承の仕組み、そしてシステムの一貫性を保つための設計上の決定によるものです。
 * 
 * ※インターフェースで、toString()（Objectクラスのメソッド）をオーバーライドするのがNG
 */
*/