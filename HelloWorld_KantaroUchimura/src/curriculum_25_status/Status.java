package curriculum_25_status;

import java.util.Random;

public class Status extends Character {

	//各ステータスをランダム値で初期化
	public Status(String name) {
		super(
				name,
				//HP
				new Random().nextInt(1000),
				//MP
				new Random().nextInt(1000),
				//攻撃力
				new Random().nextInt(500),
				//素早さ
				new Random().nextInt(1000),
				//防御力
				new Random().nextInt(100)
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

