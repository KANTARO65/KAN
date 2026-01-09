package curriculum_23;

public class Theme2 {

	public static void main(String[] args) {
		//Animalクラスのインスタンスを作成
		Animal lion = new Animal();

		//setter設定内容
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		//getter出力内容
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}

//Animalクラス
class Animal {
	//フィールド
	private String name;
	private double length;
	private int speed;

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//getter
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}
}
