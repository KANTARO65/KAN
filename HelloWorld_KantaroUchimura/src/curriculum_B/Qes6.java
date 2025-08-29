package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		//入力
		Scanner sc = new Scanner(System.in);
		System.out.println("商品名を「、」区切りで入力してください:");
		String input = sc.nextLine();
		sc.close();

		//「、」区切り
		String[] products = input.split("、");

		//ランダム生成
		Random rand = new Random();

		//入力にテレビ・ディスプレイが含まれているか判定
		boolean hasTV = input.contains("テレビ");
		boolean hasDisplay = input.contains("ディスプレイ");

		//両方あった場合のテレビ・ディスプレイ在庫数
		int tvStock = (hasTV && hasDisplay) ? rand.nextInt(12) : -1;
		int displayStock = (hasTV && hasDisplay) ? 11 - tvStock : -1;

		//入力内容に応じた処理
		for (String product : products) {
			switch (product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = rand.nextInt(12);
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;

			case "テレビ":
				//両方ある場合はtvStock、なければ新たにランダム生成
				int tvValue = (hasTV && hasDisplay) ? tvStock : rand.nextInt(12);
				System.out.println("テレビの残り台数は" + tvValue + "台です\n");
				break;
				
			case "ディスプレイ":
				//両方ある場合はdisplayStock、なければ新たにランダム生成
				int dispValue = (hasTV && hasDisplay) ? displayStock : rand.nextInt(12);
				System.out.println("ディスプレイの残り台数は" + dispValue + "台です\n");
				break;

			default:
				System.out.println("『 " + product + " 』は指定の商品ではありません\n");
				break;
			}
		}
	}
}
