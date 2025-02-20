import java.util.Scanner;

// 流程控制 - 判斷式
public class ConditionalStatement {
    public static void main(String[] args) {
        // 使用標準輸入(從終端機輸入資料)
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入數字:");
        int x = s.nextInt();
        x = x * 10;
        System.out.println(x);
        // 判斷式
        /*
         * if(布林值){
         * 為真時執行;
         * }else if{
         * 第一條件為假，第二條件為真時執行;
         * }else{
         * 為假時執行;
         * };
         */
        if (x < 100) {
            System.out.println("數值小於100");
        } else if (x < 500) {
            System.out.println("數值小於500");
        } else {
            System.out.println("數值大於500");
        }
        /*
         * switch (變數) {
         * case 條件1:
         * 符合條件1執行;
         * break;
         * case 條件2:
         * 符合條件2執行;
         * break;
         * case 條件3:
         * 符合條件3執行;
         * break;
         * default:
         * 以上條件都不符合時執行;
         * break;
         * }
         */
        int x1 = 3;
        int x2 = 8;
        System.out.println("請問你想如何運算?我們支援+ -  * /");
        Scanner s2 = new Scanner(System.in);
        String op = s2.next();
        System.out.printf("使用者輸入的運算方式:%s%n", op);
        switch (op) {
            case "+":
                System.out.println(x1 + x2);
                break;
            case "-":
                System.out.println(x1 - x2);
                break;
            case "*":
                System.out.println(x1 * x2);
                break;
            case "/":
                System.out.println(x1 / x2);
                break;

            default:
                System.out.println("輸入錯誤");
                break;
        }
    }
}
