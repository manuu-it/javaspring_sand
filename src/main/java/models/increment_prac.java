package models;

public class increment_prac {

	public static void main(String[] args) {
		int num = 10;

		System.out.println("START:" + num);

		while (num++ <= 10) {
			//通過する。
			System.out.println("A" + num);
			num++;
			System.out.println("B" + num);
		}
		System.out.println(num);
	}
}

/*
 インクリメント演算子 (++) は不等号 (<=) よりも優先順位が高いですが、
 後置インクリメント (num++) の動作 によって処理の順序が変わってきます。

＜後置インクリメント (num++) の動作＞
num++ は 現在の num の値を返した後にnum を増加させます。
そのため、比較の計算 (<= 10) が行われる時点ではまだ num の値が増えていないのです。

＜実際の処理の順序＞
while (num++ <= 10) を分解して考えると、以下の順序で評価されます：
num の 元の値 (10) を使って 10 <= 10 を評価 → true
比較の後 に num++ が働き、num は 11 になる

ループ内部の処理を実行
次のループの再評価時に num++ <= 10 をチェック → num は 11 なので 11 <= 10 は false になり、ループ終了

このように、後置インクリメント (num++) は「値を返した後に増加」するため、比較の計算 (<= 10) を行う時点ではまだ増加していないという動作になります。

＜もし前置インクリメント (++num) だったら？＞
もし while (++num <= 10) に変更すると、
インクリメントが 先に実行 されるため、num は 11 になり、
11 <= 10 が false になってしまい、ループが一度も実行されなくなります。
*/