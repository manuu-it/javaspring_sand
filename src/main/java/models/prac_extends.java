package models;

class A {
	String val = "A";

	void print() {
		System.out.print(val);
	}
}

class B extends A {
	String val = "B";
}

class prac_extends {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		System.out.print(a.val);
		System.out.print(b.val); //※①
		a.print();
		b.print();//※②

		//AAAA　が出力される。
	}
}

//class prac_extends {
//public static void main(String[] args) {
//	A a = new A();
//	B b = new B();　　　　　　　　　　　　　　　　　//ここをB型に変更した。
//	System.out.print(a.val);
//	System.out.print(b.val);
//	a.print();
//	b.print();
//	
//	　　　　　　　　　　　　　　　　　　　　　　　　　//ABAA　が出力される。
//}
//}

/*①
 * フィールドのアクセスは、変数の型に基づいて行われます。 
 * A b のように宣言された場合、b.val は A クラスの val を参照します。
 * 
 * ＜詳細＞
 * b は型 A なので、
 * コンパイラは変数 b を通してアクセスできるフィールドやメソッドを、
 * クラス A の定義に基づいて判断します。
 * 
 * クラス B は A を継承しており、同じ名前のフィールド val を再定義（隠蔽）しています。
 * しかし、変数の型が A である場合、アクセスされるのはスーパークラス A で定義された val フィールドです。
 * 
 * 	したがって、System.out.print(b.val); は A を出力
 */

/*②
 * ・メソッドの呼び出しは、実際のオブジェクトの型に基づいて行われます（動的ディスパッチ）。
 * ・スーパークラスで定義されたメソッド内でアクセスされるフィールドは、
 * 　スーパークラスで定義されたフィールドを参照する。
 * 
 * ＜詳細＞
 * b は型 A の変数ですが、実際にはクラス B のインスタンスを参照しています。
 * b.print() を呼び出すと、メソッドの解決は実行時のオブジェクトの型（ここでは B）に基づいて行われます。
 * クラス B は print() メソッドをオーバーライドしていません。
 * そのため、スーパークラス A の print() メソッドが実行されます。
 * スーパークラス A の print() メソッド内では、System.out.print(val); が実行されます。
 * ここで重要なのは、メソッド内でアクセスされる val フィールドは、
 * 　そのメソッドが定義されたクラスのコンテキストで評価されるということです。
 * 　print() メソッドはクラス A で定義されているため、クラス A の val フィールド（"A"）にアクセスします。
 */
