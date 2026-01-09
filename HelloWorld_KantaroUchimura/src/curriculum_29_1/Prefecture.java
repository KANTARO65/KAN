package curriculum_29_1;

public class Prefecture {
	//都道府県名
	private String name;
	//県庁所在地
	private String capital;
	//面積
	private double area;

	//コンストラクタ
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	//getter
	public String getName() {
		return this.name;
	}

	public String getCapital() {
		return this.capital;
	}

	public double getArea() {
		return this.area;
	}

	//表示用メソッド
	public void display() {
		System.out.println("都道府県名：" + this.name);
		System.out.println("県庁所在地：" + this.capital);
		System.out.println("面積：" + this.area + "km2");
		System.out.println();
	}
}
