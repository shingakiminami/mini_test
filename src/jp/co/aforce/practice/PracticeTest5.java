package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {


		//練習問題②

		ArrayList<String> animals = new ArrayList<>();
				animals.add("犬");
				animals.add("猫");
				animals.add("うさぎ");
				animals.add("へび");


		//練習問題③　ネットで調べました。

			String likes = "犬";

			if (likes.contains(likes)) {
				System.out.println(likes + "はリストに含まれています");
			}else{
				System.out.println(likes + "はリストに含まれていません");
			}






		//練習問題④


		int birthDay = 5;



		switch( birthDay ) {

		case 1:
			System.out.println("1月：元旦、成人の日");
			break;

		case 2:
			System.out.println("２月：建国記念日の日、天皇誕生日");
			break;

		case 3:
			System.out.println("３月：春分の日");
			break;

		case 4:
			System.out.println("４月：昭和の日");
			break;

		case 5:
			System.out.println("５月：憲法記念日、みどりの日、こどもの日");
			break;

		case 6:
			System.out.println("６月：（なし）");
			break;

		case 7:
			System.out.println("７月：海の日、スポーツの日");
			break;

		case 8:
			System.out.println("８月：山の日");
			break;

		case 9:
			System.out.println("９月：敬老の日、秋分の日");
			break;

		case 10:
			System.out.println("１０月：（なし）");
			break;

		case 11:
			System.out.println("１１月：文化の日、勤労感謝の日");
			break;

		case 12:
			System.out.println("１２月：（なし）");
			break;

		}



	}

}
