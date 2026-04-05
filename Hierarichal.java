class A {
    void show() {
        System.out.println("ENTER YOUR NAME ");
    }
}

class B extends A {
    void disp() {
        System.out.println("MY NAME IS SAHIL :");
    }
}

class C extends A {
    void print() {
        System.out.println("MY NAME IS AMAN ");
    }
}

public class Hierarichal {
    public static void main(String[] args) {
        B obj = new B();
        C objs = new C();

        obj.show();
        obj.disp();

        objs.show();
        objs.print();
    }
}
