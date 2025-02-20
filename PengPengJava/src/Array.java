import java.util.Scanner;

// 陣列[] Array : 一種資料型態，用來存放許多同型態的資料。
public class Array {
    public static void main(String[] args) {
        // 初始化陣列的語法 : 陣列資料型態 陣列變數名稱 = nwe 資料型態[陣列長度];
        // 取得陣列的長度 : 陣列變數名稱.length
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入班級總人數 : ");
        int pepor = s.nextInt();

        int[] xArray = new int[pepor]; // 班上的人數
        int aSize = xArray.length;
        System.out.println("陣列長度 : " + aSize);
        // 利用迴圈逐一取得陣列中的資料 for(int i = 0 ; i < 陣列變數名稱.length ; i++){印出資料(陣列變數名稱[i]);}

        for (int i = 0; i < aSize; i++) {
            int test = (int) (Math.random() * 100) + 1; // 隨機給成績
            xArray[i] = test;
        }
        int total = 0;
        for (int i = 0; i < aSize; i++) { // 印出每位學生的成績
            total = total + xArray[i];
            System.out.printf("第%d位學生成績為%d%n", i + 1, xArray[i]);
        }
        // 計算平均
        double avg = total / (double) aSize;

        System.out.printf("班上共有%d位學生，全班總成績為 %d分，全班平均為 %f分", aSize, total, avg);
        // 存放陣列資料的語法 : 陣列變數名稱[資料編號] = 值;
        // 拿取陣列中資料的語法 : 陣列變數名稱[資料編號];
        // 初始化的同時給值 : 陣列資料型態 陣列變數名稱 = new 資料型態[]{資料,資料,資料,資料,資料};

    }
}
