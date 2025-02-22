import testPackage.Point;

public class App {
    // 程式進入點
    public static void main(String[] args) {
        // 類別的呼叫
        System.out.println(Point.xStatic); // 調用類別屬性
        System.out.println(Point.yStatic);
        Point.lineStatic(); // 調用類別方法

        // 物件的呼叫
        Point p = new Point(5, 6); // 需先初始化物件實體
        System.out.println(p.x); // 調用物件屬性
        System.out.println(p.y);
        p.lineObj(); // 調用物件方法

    }
}
