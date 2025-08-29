package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		//列数
		for (int i = 1; i <= 9; i++) {
			String line = "";
			//行数
			for (int j = 1; j <= 9; j++) {

				//2桁表示
				String formattedI = String.format("%02d", i);
				String formattedJ = String.format("%02d", j);
				String result = String.format("%02d", i * j);

				//文字列結合
				line += formattedI + " * " + formattedJ + " = " + result;

				//区切り文字
				if (j < 9) {
					line += " || ";
				}
			}

			//1行ずつ空白行を挟んで出力
			System.out.println(line);
			System.out.println();
		}

	}

}
