/*
 * 類別定義
 * class 類別名稱{static 回傳值 方法名稱(參數資料型態 變數名稱){}}
 */
public class App {
    public static void main(String[] args) {
        // 類別Class - 1.組織程式的基礎單位 : 屬性、方法
        // 屬性Attribute static 資料型態 屬性名稱 = 初始資料;
        System.out.println(test.a); // 10
        System.out.println(test2.c); // Hello
        App.hello(); // hello
        App.hi("你好"); // 你好
        App.his("胖胖", "肚子餓"); // 胖胖 : 肚子餓
        String t2 = App.his2("庫米", "想睡覺");
        System.out.println(t2); // 庫米 : 想睡覺
    }

    static void hello() {
        System.out.println("hello");
    }

    static void hi(String msg) {
        System.out.println(msg);
    }

    static void his(String name, String msg) {
        System.out.println(name + ":" + msg);
    }

    static String his2(String name, String msg) {
        // 回傳String，呼叫時需用String資料型態接收
        return name + ":" + msg;
    }
}

// 在class內建立多個class，但因為沒有main進入點，所以僅能被呼叫
class test {
    static int a = 10;
    static double b = 3.14;
}

class test2 {
    static String c = "Hello";
}
