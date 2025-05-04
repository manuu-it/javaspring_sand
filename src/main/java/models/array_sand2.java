package models;

public class array_sand2 {
	public static void main(String[] args) {

/*コンパイルエラー になる例
	//	int[2] bb = new int[]:
	//	int[][] bb = new int[][5];
	//	int[][] abc = new int[][];
*/
		int[][] two =new int[2][2];
		two[0][0]=0;
		two[0][1]=1;
		two[1][0]=2;
//		two[1][1]=3;
		//mainメソッドないであれば、初期化ブロック{}不要
		
		
		int[][] two2 =new int[2][3];
	}
	
	class array_sand_wk{
		
		int[][] two =new int[2][2];
		{
		two[0][0]=0;
		two[0][1]=1;
		two[1][0]=2;
		two[1][1]=3;
		}
		//初期化ブロックがない場合、コンパイルエラー
	}
}