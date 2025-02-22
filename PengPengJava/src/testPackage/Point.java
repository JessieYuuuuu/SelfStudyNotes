package testPackage;

public class Point {
    // 類別的屬性
    public static int xStatic = 8;
    public static int yStatic = 9;

    // 類別的方法
    public static void lineStatic() {
        System.out.println("類別的方法 : " + xStatic + "," + yStatic);
    }

    // 物件的建構式
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 物件的屬性
    public int x;
    public int y;

    // 物件的方法
    public void lineObj() {
        System.out.println("物件的方法 : " + x + "," + y);
    }

}
