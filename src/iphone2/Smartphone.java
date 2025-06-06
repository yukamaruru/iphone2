package iphone2;

public class Smartphone implements Mp3player{
	//クラスにインターフェイスを実装するにはimplementsを指定する。
	//またMp3playerで作ったルール（メソッド）は必ずsmartphoneクラスで
	//上書きし、処理内容を記述する必要がある。
	public void play() {
		System.out.println("再生");
	}
	public void stop() {
		System.out.println("停止");
	}
	public void next() {
		System.out.println("次へ");
	}
	public void back() {
		System.out.println("戻る");
	}

}
