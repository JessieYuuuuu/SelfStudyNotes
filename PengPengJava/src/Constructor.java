public class Constructor {

    // 類別Class(物件) - 2.物件實體的藍圖 : 建構式、屬性、方法
    // 建構式
    // 規則 : 名稱必須與class相同，且不能有返回值。
    // 用途 : 用於初始化實體類，在創建時自然調用，不能直接調用
    // 建構式不會被子類繼承，但子類可透過super調用父類的建構式。

    // 無傳參數建構式
    public Constructor() {
    }

    // 有參數的建構式
    public Constructor(int x, int y) {

    }

    // 只要回傳參數不同，就可以建立多個建構式
    public Constructor(int x, String name) {

    }

    // 方法
    // 規則 : 需寫返回值的資料型態，void為無返回值。
    // 用途 : 在實體類被創建後可以調用。
    // 方法會被子類繼承，繼承後可直接使用，且子類可用override進行覆寫。

    // 無傳參數的方法
    public void myMethod() {
        // 要做的事
    }

    // 有參數的方法
    public void myMethod(int x) {
        // 要做的事
    }

    // 只要參數不同，就可以建立多個同名稱的方法(方法重載 Method Overloading)
    public void myMethod(int x, int y) {
        // 要做的事
    }

    // 有回傳值(回傳String)的方法
    public String myMethodReturnString() {
        // 要做的事
        return "";
    }

}
