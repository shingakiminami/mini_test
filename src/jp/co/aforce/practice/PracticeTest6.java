package jp.co.aforce.practice;

public class PracticeTest6 {


	public static void main(String[] args) {


		//練習問題①

		int fortune = new java.util.Random().nextInt(4);


			switch( fortune ) {

			case 1:
				System.out.println("吉です");
				break;

			case 2:
				System.out.println("中吉です");
				break;

			case 3:
				System.out.println("大吉です");
				break;

			default:
				System.out.println("凶です");
				break;
			}


		//練習問題②


			int i = 0;
			int count = 1;
					while(count <= 100) {

						if(count %7 == 0 ) {
							System.out.println(count);
							i += count;
						}

						count++;

					}
			System.out.println("7の倍数の総合計は" + i);


		//練習問題③





	}

}
