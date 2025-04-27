package models;

public class record_wk {

	public static void main(String[] args) {

		Custemer cus = new Custemer("aaa", 5);

		//レコードクラスインスタンスが提供するメソッド
		System.out.println(cus.name());
		System.out.println(cus.age());
		System.out.println(cus.toString());
		System.out.println(cus.hashCode());
		
		/*Recordクラスの他の制約
		 * 
		 * Recordクラスは サブクラスの作成不可
		 * Setterメソッドはない。定義から不変。
		 * 	 
		 */
	}

	//インナーレコードとしての定義（アクセス修飾子は「なし/Public/private/protected）
	protected record Custemer(String name, int age) {
		
		//Recordクラスにおいて、staticではないフィールドは定義不可。
		int aaa;
		static int bbb;
	}

}
