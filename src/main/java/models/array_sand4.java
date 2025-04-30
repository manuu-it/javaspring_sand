package models;

public class array_sand4 {

	public static void main(String[] args) {

		String[][] array = { { "A", "B" } };

//		for (String[] aaa : array) {//正常
		for (String[] array : array) {//変数重複のためコンパイルエラー
//		for (Object obj : array) { //正常

			System.out.println(aaa);
		}
	}
}

//		for (int i = 0; i < array.length; i++) {
//
//			for (int j = 0; j < array[i].length; i++) {
//
//				System.out.println(array[i][j]);
//			}
//		}