// 運算符號
public class Operator {
    public static void main(String[] args) {
        // 算術運算 + - * / %
        int a = 5 + 2;
        System.out.println(a);
        int b = 5 - 2;
        System.out.println(b);
        int c = 5 * 2;
        System.out.println(c);
        int d = 5 / 2;
        System.out.println(d);
        double d2 = 5 / 2.0;
        System.out.println(d2);
        int e = 5 % 2;
        System.out.println(e);
        double e2 = 5 % 3.5;
        System.out.println(e2);
        System.out.println("------");

        // 指定(賦值)運算assign = += -= *= /= %=
        int o = 5;
        o = o + 8;
        System.out.println(o);
        int u = 1;
        u += 1;
        System.out.println(u);
        u -= 1;
        System.out.println(u);
        u *= 5;
        System.out.println(u);
        u /= 2;
        System.out.println(u);
        u %= 3;
        System.out.println(u);
        System.out.println("------");
        // 比較運算 > < >= <= == != 答案為布林值
        // ==比較資料是否相等，=指定(賦值)運算

        // 單元運算 : 針對單一資料做操作 ++ -- !
        int g = 5;
        g++;
        System.out.println(g);
        // ! 針對布林值做反轉
        boolean f = !true;
        System.out.println(f); // false
        f = !f;
        System.out.println(f); // true
        System.out.println("---------");

        boolean n1 = true || true;
        System.out.println(n1);
        boolean n2 = true || false;
        System.out.println(n2);
        boolean n3 = false || true;
        System.out.println(n3);
        boolean n4 = false || false;
        System.out.println(n4);
        System.out.println("---------");
    }
}
