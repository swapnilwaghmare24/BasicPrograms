package Com.Bridgelabz;

public class VariablesDemo {


    static String name = "First";
    static int a = 10;

    static void m1() {
        int b = 10;
        int c = 20;
        System.out.println("Addition is " + (b + c));
    }

    void m2() {
        int b = 40;
        int c = 20;
        System.out.println("Substraction is " + (b - c));
    }


    static void change() {
        System.out.println(name);
        name = "second";
        System.out.println(name);
    }

    public static void main(String[] args) {
        m1();
        VariablesDemo vd = new VariablesDemo();
        vd.m2();
        change();
        int count = 0, var = 0;
        count = var++ + var++ + ++var;
        System.out.println(count);
        System.out.println(var);
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

