package curriculum_B;

import java.util.Locale;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int n; //生徒人数

		//生徒人数入力
		do {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			n = sc.nextInt();
		} while (n < 2);

		//0:英語,1:数学,2:理科,3:社会
		double[][] scores = new double[n][4];

		String[] subjects = {"英語", "数学", "理科", "社会"};

		//各生徒成績入力
		int studentNumber = 1;
		for (double[] studentScores : scores) {
			int subjectIndex = 0;
			for (String subjectName : subjects) {
				System.out.print(studentNumber + "人目の『" + subjectName + "』の点数を入力してください : ");
				studentScores[subjectIndex] = sc.nextDouble();
				subjectIndex++;
			}
			System.out.println();
			//次の生徒へ
			studentNumber++;
		}

		//各生徒平均点計算・出力
		double totalSum = 0;
		studentNumber = 1;
		for (double[] studentScores : scores) {
			double sum = 0;
			for (double score : studentScores) {
				sum += score;
			}
			double avg = sum / studentScores.length;
			System.out.printf("%d人目の平均点は%.2f点です。\n", studentNumber, avg);
			totalSum += sum;
			studentNumber++;
		}
		System.out.println();

		//各科目平均点計算・出力
		for (int j = 0; j < subjects.length; j++) {
			double sum = 0;
			for (double[] studentScores : scores) {
				sum += studentScores[j];
			}
			double avg = sum / n;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);
		}

		//全体平均点
		double overallAvg = totalSum / (n * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

		sc.close();
	}
}