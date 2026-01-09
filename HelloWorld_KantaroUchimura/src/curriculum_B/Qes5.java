package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		//行数
		for (int j = 1; j <= 9; j++) {
			String line = "";
			//列数
			for (int i = 1; i <= 20; i++) {
				//3桁表示
				String formattedI = String.format("%03d", i);
				String formattedJ = String.format("%03d", j);
				String result = String.format("%03d", i * j);

				//文字列結合
				line += formattedI + " * " + formattedJ + " = " + result;

				//区切り文字
				if (i < 20) {
					line += " || ";
				}
			}

			//1行ずつ空白行を挟んで出力
			System.out.println(line);
			System.out.println();
		}

	}

}
