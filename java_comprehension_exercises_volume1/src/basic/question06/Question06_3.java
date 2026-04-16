package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amount = 0;

		int price = 100;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("鉛筆を購入しますか。");
		System.out.println("はい：0、いいえ：1 >");
		String a = reader.readLine();
		int buyFlag = Integer.parseInt(a);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を 1 つ増やしますか？");
			System.out.println("はい：0、いいえ：1 >");
			String str = reader.readLine();
			buyFlag = Integer.parseInt(str);
		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です");

	}

}
