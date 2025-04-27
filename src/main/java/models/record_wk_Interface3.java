package models;

public class record_wk_Interface3 {

	//voidの場合、mainメソッドの戻り値の互換性が合わず、コンパイルエラーになる。
	//	public interface Test {
	//		default void name() {
	//			System.out.println("test");
	//		}
	//	}

	//戻り値がStringの場合、互換性が合うのでOK。
	public interface Test {
		default String name() {
			return "Test";
		}
	}

	public record Data(String name) implements Test {
	}

	public static void main(String[] args) {

		Data data = new Data("B");
		System.out.println(data.name());
		//name()メソッドはRecordクラスのインスタンス化でオーバーライドされるため、Bが出力される。
		//オーバーライドはシグニチャ（メソッド名と引数）が同じでも、戻り値が異なる場合はNG。

	}

}