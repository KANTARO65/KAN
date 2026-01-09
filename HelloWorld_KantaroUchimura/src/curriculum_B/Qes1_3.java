package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = "";

		//ユーザー名入力
		while (true) {
			System.out.print("ユーザー名を入力してください: ");
			username = scanner.nextLine();

			//入力チェック
			if (username == null || username.trim().isEmpty()) {
				System.out.println("名前を入力してください");
				System.out.println();
			} else if (username.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
				System.out.println();
			} else if(!username.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("半角英数字のみで名前を入力してください");
				System.out.println();
			} else {
				System.out.println("ユーザー名「" + username + "」を登録しました");
				System.out.println();
				break;
			}
		}

		//じゃんけんシステム
		Random random = new Random();
		//じゃんけん回数
		int count = 0;
		
		while (true) {
			count++;

			//プレイヤーの手
			int myHand = scanner.nextInt();
			
			//システムの手
			int enemyHand = random.nextInt(3);
			System.out.println(username + "の手: " + handToString(myHand));
			System.out.println("相手の手: " + handToString(enemyHand));
			System.out.println();

			//勝敗判定
			if (myHand == enemyHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println();
			} else if (
					//勝ち
					(myHand == 0 && enemyHand == 1) ||
					(myHand == 1 && enemyHand == 2) ||
					(myHand == 2 && enemyHand == 0)) {
				System.out.println("やるやん。\n次は俺にリベンジさせて");
				System.out.println();
				break;
			} else {
				//負け
				if (enemyHand == 0) {
					System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
				} else if (enemyHand == 1) {
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
				} else if (enemyHand == 2) {
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
				}
				System.out.println();
			}
		}

		System.out.println("じゃんけんを行った回数: " + count);

		scanner.close();
	}

	//手を文字列に変換
	private static String handToString(int hand) {
		switch (hand) {
		case 0: return "グー";
		case 1: return "チョキ";
		case 2: return "パー";
		default: return "不正な手";
		}
	}
}
