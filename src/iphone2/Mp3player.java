package iphone2;

public interface Mp3player {
	//これからルール作りますよという宣言。
	//継承と組み合わせることができる。
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
	//interfaceとabstractはセット。
	//メソッド名のみで処理は書かないことを「抽象メソッド」という。
	//具体的な処理を書かないからabstract(抽象的な)というワードを使う。

}
