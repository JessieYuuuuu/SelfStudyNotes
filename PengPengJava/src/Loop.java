// 流程控制 - 迴圈

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*
         * while迴圈
         * while(布林值){
         * 條件為真時，執行此區塊
         * 執行完後再次判斷，直到條件不成立為止
         * }
         */
        int total = 0;
        int n = 1;
        while (n <= 1) {
            total = total + n;
            System.out.printf("第%d次加總=%d%n", n, total);
            n++;
        }
        System.out.printf("總共進行%d次加總，最終結果為:%d%n", n - 1, total);

        /*
         * for迴圈
         * for(初始化;布林;執行完下方區塊後要做的事){
         * 布林為真時要做的事;
         * }
         */
        int total2 = 0;
        int x;
        for (x = 0; x < 8; x++) {
            total2 = total2 + x;
            System.out.printf("第%d次加總=%d%n", x, total2);
        }
        System.out.printf("總共進行%d次加總，最終結果為:%d%n", x - 1, total2);
        // 與迴圈搭配的指令
        // continue : 強制返回迴圈開頭，進入下一圈
        // break : 強制結束迴圈

        // continue
        for (int y = 0; y <= 100; y++) {
            if (y % 2 == 0) {
                continue; // 如果y可以被2整除，就直接進入下一圈
            }
            System.out.println(y);
        }
        // break
        int z = 1;
        while (z < 5) {
            if (z == 2) {
                break;
            }
            System.out.println(z);
            z++;

        }
        System.out.printf("找到%d了!!%n", z);

        Scanner s = new Scanner(System.in);
        System.out.println("請輸入10000以內的正整數 : ");
        int userinput;
        // 實用案例
        while (true) {
            userinput = s.nextInt();
            if (userinput >= 0 && userinput <= 10000) {
                System.out.println("輸入正確");
                break;
            } else {
                System.out.println("輸入錯誤");
            }
        }
        System.out.printf("您輸入的是 %d%n", userinput);
        int total3 = 0;
        for (int d = 0; d <= userinput; d++) {
            total3 = total3 + d;
        }
        System.out.printf("從1到%d的總合為 : %d%n", userinput, total3);

    }
}
