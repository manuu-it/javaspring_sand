package models;

public record record_wk2(String name) {

	//  コンパイルエラー例
	//	public record_wk2(){
	//	}

	/*
	 * 代替コンストラクタの定義
	 *・標準コンストラクタと同じ引数を受け取ること
	 *・全てのフィールドを初期化すること
	 *・レコードそのもののアクセス修飾子よりも厳しい物を使ってはいけない（同じか緩くすること）
	 **/

	/*TODO アクセス修飾子の制約順
	①public > ②protected > ③デフォルト > ④private
	
	①どこからでもアクセス可能(制限が掛かっていないのと同じ)
	②同一パッケージとサブクラスからアクセス可能
	③同一パッケージ内のすべてのクラスからアクセス可能。サブクラスからアクセス不可。
	④同一クラスからのみアクセス可能
	*/

	//可視性が下がるためコンパイルエラー
	//	private record_wk2(String name){
	//	 this.name=name;
	//	}

	//可視性が下がるためコンパイルエラー
	//	record_wk2(String name) {
	//		this.name = name;
	//	}

	public record_wk2(String name) {
		this.name = name;
	}
	
	//引数を受け取らない場合
	//　→record_wk3クラスで記述。

}
