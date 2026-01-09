package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//バイト型変数	
		byte example1;
		example1 = 0;
		System.out.println(example1);
		//短整数型
		short example2;
		example2 = 0;
		System.out.println(example2);
		//整数型
		int example3;
		example3 = 0;
		System.out.println(example3);
		//長整数型
		long example4;
		example4 = 0l;
		System.out.println(example4);
		//単精度浮動小数点数型
		float example5;
		example5 = 0.0f;
		System.out.println(example5);
		//倍精度浮動小数点数型
		double example6;
		example6 = 0.0;
		System.out.println(example6);
		//文字型
		char example7;
		example7 = '\u0000';
		System.out.println(example7);
		//文字列型
		String example8;
		example8 = null;
		System.out.println(example8);
		//ブーリアン型
		boolean example9;
		example9 =  false;
		System.out.println(example9);
		//再代入
		example1 = 10;
		example2 = 100;
		example3 = 1000;
		example4 = 10000l;
		example5 = 9.5f;
		example6 = 10.5;
		example7 = 'a';
		example8 = "ハロー";
		example9 = true;

		//改行
		System.out.println("");
		//11110
		System.out.println(example1 + example2 + example3 + example4);
		//20
		System.out.println(example3 - (example1 + example2 + (int)example5 * 90));
		//a ハロー true
		System.out.println(example7 + " " + example8 + " " + example9);
		//11130
		long sumAll = example1 + example2 + example3 + example4 + (long)example5 + (long)example6;
		System.out.println(sumAll);
		//10000000000
		long productAll = example1 * example2 * example3 * example4;
		System.out.println(productAll);
		//0.105
		System.out.println(example6 / 100);
		//-90
		System.out.println(example1 - example2);

		//改行
		System.out.println("");
		//ハローJAVA43
		String num="20";
		int num1=23;
		int sum = Integer.parseInt(num) + num1;
		System.out.println("ハローJAVA"+sum);

		//改行
		System.out.println("");
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favoriteFood = "寿司";
		//再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favoriteFood = "オムライス";
		//和算で自己代入
		age += 24;
		height += 168.5;
		weight += 64.2;
		//身長を m に変換
		double heightMeter = height / 100;
		//BMI計算
		double bmi = weight / (heightMeter * heightMeter);
		//出力先
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		//BMI
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

		//改行
		System.out.println("");
		//25歳以上ならtrue表示
		System.out.println(age >= 25);

		//改行
		System.out.println("");
		//年齢・身長・体重文字列変換
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		String result = ageStr + heightStr + weightStr;
		System.out.println("文字列変換及び結合結果:" + result);

		//改行
		System.out.println("");
		//年齢・身長整数型変換
		int ageInt = Integer.parseInt(ageStr);
		int heightInt = (int) Double.parseDouble(heightStr);
		System.out.println("整数型年齢:" + ageInt);
		System.out.println("整数型身長:" + heightInt);

		//改行
		System.out.println("");
		//年齢が25もしくは身長が160以上ならtrue表示
		System.out.println(ageInt >= 25 || heightInt >= 160);
	}
}