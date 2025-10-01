package curriculum_30;

class Person {
	// インスタンスフィールド
	//名前
	String name;
	//年齢
	int age;
	//身長
	double height;
	//体重
	double weight;

	//人数カウント用変数
	static int count = 0;

	//コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		//カウンター
		count++;
	}

	//BMI
	double bmi() {
		return this.weight / (this.height * this.height);
	}

	//出力
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.printf("BMIは%.1fです\n", this.bmi());
	}
}