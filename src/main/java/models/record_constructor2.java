package models;

//トップレコードとしての定義（アクセス修飾子は「なしor Public」のみ）
public record record_constructor2(String name, int age) {
	
	//正準コンストラクタ:Recordクラスのコンストラクタ記述パターン①
	//Recordクラスのコンストラクタは「入力値の前提条件や不変条件をチェックする」のが一般的
	public record_constructor2(String name, int age) {
		// バリデーションや初期化ロジックを記述
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("名前はnullまたは空にできません");
		}
		if (age < 0) {
			throw new IllegalArgumentException("年齢は負の場合は指定できません");
		}
		// 明示的な代入（レコードのコンポーネントに値を設定）
		this.name = name;
		this.age = age;
	}
}
