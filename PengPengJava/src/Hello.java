import testPackage.test;

public class Hello {
	public static void main(String[] args) {
		// 印出資料
		System.out.println("Hello Java");
		System.out.println("My First Java Program");
		/*
		 * Java特性
		 * 1. 強型別程式語言
		 * 每個變數都有明確的資料型態定義
		 * 變數中存放的資料須符合變數宣告時定義的資料型態
		 * 2. 物件導向 - 面向對象的編程語言，所有的物件都可以用package跟class來組織和分類。
		 * a.封裝 - 通過使用 public、private 和 protected 關鍵字來控制屬性和方法的存取權限，
		 * b.繼承 - 子類可繼承父類的屬性及方法，子類可以覆寫父類的方法，使用super可調用父類的建構式、屬性及方法
		 * c.模組化重用性 - 便於維護與擴展，寫好一個方法可重複使用，減少重複代碼
		 * d.抽象 - 在抽象類別內可定義抽象方法跟一般方法，而抽象方法需由繼承該抽象類別的子類實作，且為必須實作(使用該方法名稱，呈現不同的內容)，
		 * 否則繼承抽象類的子類也需宣告為抽象，不然會編譯錯誤。
		 * 3. 平台無關性 - 可在所有安裝JVM的平台執行
		 * 4. 多執行序 - 可併行執行多個任務
		 */

		// 封包package - 用來分門別類
		// 權限控制基本概念 - 類別屬性及方法的調用限制與規則。
		// 預設權限 : 僅同package中的其他類別可以調用。
		// 公開權限 : public -> 類別屬性前或類別方法前。
		Class.hi("調用其他package的方法");
		Class.hello();
		// 直接調用
		int result = testPackage.test.add(8, 9);
		System.out.println(result);
		// 使用import
		test test2 = new test();
		System.out.println(test2.add(5, 3));
	}
}
