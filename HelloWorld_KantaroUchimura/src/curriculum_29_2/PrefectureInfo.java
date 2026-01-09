package curriculum_29_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import curriculum_29_1.Prefecture;

public class PrefectureInfo {

	public static void main(String[] args) {
        //都道府県データを配列に格納
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner sc = new Scanner(System.in);

        //入力番号
        System.out.println("番号をカンマ区切りで入力してください：");
        String input = sc.nextLine();

        //ソート順
        System.out.println("昇順 or 降順 を入力してください：");
        String order = sc.nextLine();

        //入力番号をリストに変換
        String[] inputArray = input.split(",");
        List<Integer> indexList = new ArrayList<>();

        for (String s : inputArray) {
            int index = Integer.parseInt(s.trim());
            if (index >= 0 && index < prefectures.length) {
                indexList.add(index);
            }
        }

        //ソート処理（番号を基準）
        if (order.equals("昇順")) {
            indexList.sort(Integer::compareTo); // 小さい順
        } else {
            indexList.sort(Collections.reverseOrder()); // 大きい順
        }

        //出力
        for (int idx : indexList) {
            prefectures[idx].display();
        }

        sc.close();
    }
}
