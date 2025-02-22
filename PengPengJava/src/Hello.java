import testPackage.test;

public class Hello {
	public static void main(String[] args) {
		// 印出資料
		System.out.println("Hello Java");
		System.out.println("My First Java Program");
		/*
		 * Java特性
		 * 1.強型別程式語言
		 * 每個變數都有明確的資料型態定義
		 * 變數中存放的資料須符合變數宣告時定義的資料型態
		 * 2.物件導向
		 */

		// 封包package - 用來分門別類
		// 權限控制基本概念 - 類別屬性及方法的調用限制與規則。
		// 預設權限 : 僅同package中的其他類別可以調用。
		// 公開權限 : public -> 類別屬性前或類別方法前。
		App.hi("調用其他package的方法");
		App.hello();
		// 直接調用
		int result = testPackage.test.add(8, 9);
		System.out.println(result);
		// 使用import
		test test2 = new test();
		System.out.println(test2.add(5, 3));
	}
}
