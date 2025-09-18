package curriculum_25;

import java.util.Scanner;

import curriculum_25_status.Status;

public class Curriculum_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//名前入力
		System.out.print("名前を入力してください: ");
		String name = sc.nextLine();

		//サブクラスからステータスを生成
		Status hero = new Status(name);

		//ステータス表示
		hero.showStatus();

		sc.close();
	}
}
