package curriculum_25_status;

import java.util.Random;

public class Status extends Character {

	//各ステータスをランダム値で初期化
	private static final Random rand = new Random();

	//コンストラクタ
	public Status(String name) {
		super(
				name,
				//HP
				rand.nextInt(1000) + 1,
				//MP
				rand.nextInt(1000) + 1,
				//攻撃力
				rand.nextInt(500) + 1,
				//素早さ
				rand.nextInt(1000) + 1,
				//防御力
				rand.nextInt(100) + 1
				);
	}

	//ステータス表示用メソッド
	public void showStatus() {
		System.out.println("こんにちは 「 " + getName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
