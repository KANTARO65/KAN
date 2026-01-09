package curriculum_27;

import java.util.Scanner;

public class AnimalInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = sc.nextLine();
		sc.close();

		//カンマで区切る
		String[] animals = input.split(",");

		for (String animalData : animals) {
			String[] details = animalData.split(":");
			//動物名
			String name = details[0];
			//体長
			double height = Double.parseDouble(details[1]);
			//速度
			int speed = Integer.parseInt(details[2]);

			//Animalインスタンス生成
			Animal animal = new Animal(name, height, speed);

			//出力
			animal.printInfo();
		}
	}
}
