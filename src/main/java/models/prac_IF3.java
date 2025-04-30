package models;

public class prac_IF3 {
	public static void main(String[] args) {
		prac_IF3_A a = new prac_IF3_B(); 
	
	//ABが出力される。
	//Bクラスのコンストラクタを実行する際に、コンパイラによって、Superクラス（A）のコンストラクタが実行されるため。	
	//prac_IF3_A a = new prac_IF3_B(); の場合も同様の結果。 
	}
}

class prac_IF3_A {
	public prac_IF3_A() {
		System.out.print("A");
	}
}

class prac_IF3_B extends prac_IF3_A {
	public prac_IF3_B() {
		System.out.print("B");
	}
}
