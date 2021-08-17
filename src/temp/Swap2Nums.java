package temp;

/**
 * @author cwh
 * @date 2021/8/17 17:23
 */
public class Swap2Nums {

    public static void main(String[] args) {
        int a = 0b11001;
        int b = 0b10011;
        System.out.println(a ^ b);
        method2(2,4);
        method3(a,b);
    }

    static void method1(int a, int b) {
        int temp;
        temp = b;
        b = a;
        a = temp;
    }

    static void method2(int a, int b) {
        b = a - b;
        a = a - b;
        b = b + a;
        System.out.println("a: " + a + " b:" + b);
    }

    static void method3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b:" + b);

    }

}
