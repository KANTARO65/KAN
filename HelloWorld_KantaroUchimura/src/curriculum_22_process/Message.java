package curriculum_22_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

	//フィールド変数
	private String greeting;
	private String sushiTaste;
	private String sushiInfo;
	private String nowDateTime;

	//表示内容
	public Message() {
		this.greeting = "こんにちは！ここは日本です！";
		this.sushiTaste = "この寿司はうまい";
		this.sushiInfo = "寿司は和食です";

		//現在日時のフォーマット
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.nowDateTime = "今の現在日時は" + now.format(fmt) + "です";
	}

	//メッセージ出力用
	public void printMessages() {
		System.out.println(this.greeting);
		System.out.println(this.sushiTaste);
		System.out.println(this.sushiInfo);
		System.out.println(this.nowDateTime);
	}

}
