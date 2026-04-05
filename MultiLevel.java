// multi-level inheritance
class Adding {
    protected int num1 = 1, num2 = 2, sub, multi, add;

    void add() {
        add = num1 + num2;
        System.out.println("SUM OF numbers is :" + add);
    }
}
class Subtraction extends Adding {
    void sub() {
        sub = num1 - num2;
        System.out.println("SUBTRACTION OF NUMBER IS :" + sub);
    }
}

class Multiply extends Subtraction {
    void multi() {
        multi = num1 * num2;
        System.out.println("Multiplication of NUMBER IS :" + multi);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Multiply obj = new Multiply();
        
        obj.add();
        obj.sub();
        obj.multi();
    }
}
