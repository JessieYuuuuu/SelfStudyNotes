// Java的資料型態4類8種
public class DataTypeVariable {
    public static void main(String[] args) {
        /*
         * 整數
         * byte:正負2^8(-128~127)
         * short:正負2^16(-32768~32767)
         * int:正負2^32(21e)
         * long:正負2^64
         */

        // 未宣告的情況下，整數預設型態為int
        System.out.println(3); // 3
        System.out.println(120); // 120
        // 長整數，數字末端加上L(代表為Long型態)
        System.out.println(855125486523L); // 855125486523

        /*
         * 浮點數
         * float:單精度浮點數，小數點後7位
         * double:雙精度浮點數，小數點後15位
         */
        // 未宣告情況下預設為double
        System.out.println(3.85215694117); // 3.85215694117
        // 加上f，表示為float
        System.out.println(3.85215694117f); // 3.8521569(單精度浮點數只會顯示小數點後7位)

        /*
         * 布林
         * boolean:true||falst
         */
        System.out.println(false); // false

        /*
         * 字元
         * char:''內只能存放1個字元，也可用數值印出會轉成ASCII符號
         */
        System.out.println('a'); // a
        System.out.println('嗨'); // 嗨
        // System.out.println('你好'); //error
        /*
         * ----------
         * 字串
         * ***在Java內String不算在基本型態，而是object。***
         * String:""雙引號內可輸入0~多個字元。
         */
        System.out.println("哈囉Java"); // 哈囉Java
        /*
         * 宣告變數的2種方式
         * 1.
         * 型態 名稱 = 值 ;
         * ex:
         * int x = 8 ;
         * 2.
         * 型態 名稱 ;
         * 名稱 = 值 ;
         * ex:
         * int y ;
         * y = 10;
         */
        int a = 100;
        System.out.println(a); // 100
        a = 200;
        System.out.println(a); // 可重新給值
        // a = 88888888888; // error
        // 資料型態須對應，否則無法執行
    }
}
