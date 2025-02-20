// 型別轉換原則
public class DataTypeConversion {
    public static void main(String[] args) {
        /*
         * A.數值範圍
         * double>float>long>int>short>byte
         * 1.小範圍轉大範圍 : 自動轉換
         */
        byte n1 = 3;
        int n2 = n1;
        System.out.println(n1);
        System.out.println(n2);
        /*
         * 2.大範圍轉小範圍 : error
         * 解法 強制轉型 (型態): 可能導致數字失真
         */
        int n3 = 5;
        byte n4 = (byte) n3;
        System.out.println(n3); // 5
        System.out.println(n4); // 5
        /*
         * B.字串
         * 1.字串轉成數值 型態.parse型態
         */
        String s = "56";
        int x = Integer.parseInt(s);
        System.out.println(s); // 56
        System.out.println(x); // 56

        s = "3.1415";
        double d = Double.parseDouble(s);
        System.out.println(s); // 3.1415
        System.out.println(d); // 3.1415
        // 2.數值轉成字串String.valueOf
        int z = 8;
        String s1 = String.valueOf(z);
        System.out.println(z); // 8
        System.out.println(s1); // 8

        long q = 999999;
        s1 = String.valueOf(q);
        System.out.println(q); // 999999
        System.out.println(s1); // 999999

        s1 = String.valueOf(3.14159F);
        System.out.println(s1); // 3.14159
    }
}
