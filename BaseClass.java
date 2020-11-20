public class BaseClass {

    public int add(int a, int b) {
        System.out.println("This is add method");                
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new NullPointerException();
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double sqrt(int a) {
        if (a == 0) {
            throw new NullPointerException();
        }
        return Math.sqrt(a);
    }
}