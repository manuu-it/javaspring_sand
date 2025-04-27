package models;

//抽象クラス：PracAbstract
public abstract class PracAbstract {
	protected String 名前;

	public PracAbstract(String 名前) {
		this.名前 = 名前;
	}

	public String get名前() {
		return 名前;
	}

	// 抽象メソッド：面積を計算する
	public abstract double 面積を計算する();

	// 抽象メソッド：描画する
	public abstract void 描画する();

	// 具象メソッド：情報を表示する
	public void 情報表示() {
		System.out.println("図形名：" + 名前);
		System.out.println("面積：" + 面積を計算する());
	}
}

//具象クラス：四角形
 class 四角形 extends PracAbstract {
	private double 幅;
	private double 高さ;

	public 四角形(String 名前, double 幅, double 高さ) {
		super(名前);
		this.幅 = 幅;
		this.高さ = 高さ;
	}

	@Override
	public double 面積を計算する() {
		return 幅 * 高さ;
	}

	@Override
	public void 描画する() {
		System.out.println("四角形を描画します。");
	}
}

//具象クラス：円
 class 円 extends PracAbstract {
	private double 半径;

	public 円(String 名前, double 半径) {
		super(名前);
		this.半径 = 半径;
	}

	@Override
	public double 面積を計算する() {
		return Math.PI * 半径 * 半径;
	}

	@Override
	public void 描画する() {
		System.out.println("円を描画します。");
	}
}

 class Main {
	public static void main(String[] args) {
		// PracAbstract abstract なのでインスタンス化できません
		// PracAbstract figure = new PracAbstract("図形"); // コンパイルエラー

		四角形 rectangle = new 四角形("長方形", 5, 10);
		円 circle = new 円("丸", 3);

		rectangle.情報表示();
		circle.情報表示();

		PracAbstract[] figures = new PracAbstract[2];
		figures[0] = rectangle;
		figures[1] = circle;

		for (PracAbstract figure : figures) {
			figure.描画する(); // ポリモーフィズム：それぞれの描画処理が実行される
		}
	}
}