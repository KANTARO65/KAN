package curriculum_27;

public class Animal {
	//動物名
	private String name;
	//体長
	private double height;
	//速度
	private int speed;
	//学名
	private String scientific;

	//コンストラクタ
	public Animal(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;

		//学名
		switch (name) {
		case "ライオン":
			this.scientific = "パンテラ レオ";
			break;
		case "ゾウ":
			this.scientific = "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			this.scientific = "アイルロポダ・メラノレウカ";
			break;
		case "チンパンジー":
			this.scientific = "パン・トゥログロディテス";
			break;
		case "シマウマ":
			this.scientific = "チャップマンシマウマ";
			break;
		default:
			this.scientific = "不明";
		}
	}

	//出力用メソッド
	public void printInfo() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.height + "m");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：" + this.scientific);
		System.out.println();
	}
}
