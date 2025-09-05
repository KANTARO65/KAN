package curriculum_new_1_18;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String word, int number) {
		System.out.println("Q1:" + word + " " + number);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply(int a, int b) {
		int result = a * b;
		System.out.println("Q2:" + a + "×" + b + "=" + result);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] numbers) {
		System.out.println("Q3:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiply(double a, double b) {
		double result = a + b;
		System.out.println("Q4:" + a + "+" + b + "=" + result);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];

		System.out.println("Q5:");
		for (int i = 0; i < count; i++) {
			//1～100の範囲（0含まず）
			int randomValue = rand.nextInt(100) + 1;
			numbers[i] = randomValue;
			System.out.println(randomValue);
		}
		return numbers;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double calculateAverage(int[] numbers) {
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}

		double average = sum / numbers.length;
		System.out.println("Q6:" + average);
		return average;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isAverageAbove50(double average) {
		boolean result = average >= 50;
		System.out.println("Q7: " + result);
		return result;
	}
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//Q1呼び出し
		hello("Hello JavaSE", 11);

		System.out.println();

		//Q2呼び出し（整数版）
		multiply(9, 5);

		System.out.println();

		//Q3呼び出し
		int[] data = {11, 22, 33, 44, 55};
		printArray(data);
		System.out.println();

		//Q4呼び出し（小数版）
		multiply(3.6, 2.4);
		System.out.println();

		//Q5呼び出し
		int[] randomArray = generateRandomNumbers(5);
		System.out.println();

		//Q6呼び出し
		double avg = calculateAverage(randomArray);
		System.out.println();

		//Q7呼び出し
		isAverageAbove50(avg);
	}
}
