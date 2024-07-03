public class TestRecursion {
    public static void main(String[] args) {
        System.out.print("(main");
        a();
        System.out.print("main)");
        System.out.println();
    }

    private static void a() {
        System.out.print("(a");
        b();
        System.out.print("a)");
    }

    private static void b() {
        System.out.print("(b");
        c();
        System.out.print("b)");
    }

    private static void c() {
        System.out.print("(c");
        d();
        System.out.print("c)");
    }

    private static void d() {
        System.out.print("(d)");
    }


}
