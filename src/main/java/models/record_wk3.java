package models;

public record record_wk3(String name) {

	/*
	 * レコードクラス内に、クラス定義の際に、引数を受け取らない場合
	 * 
	 * 標準コンストラクタの呼び出しを行う必要がある。
	 * 
	 * インスタンス変数への引数の代入ができない。コンパイルエラーになる。
	 */
	
	//OK
	public record_wk3() {
		this("名前");
	}
	
	//コンパイルエラー
//	public record_wk3() {
//		this.name = name;
//	}

}
