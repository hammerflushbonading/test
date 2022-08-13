package ctrl;

public class fordemo {
    public static void main(String[] args) {
        f(10000);
    }

    public static int f(int n) {
        if(n == 1) {
            System.out.println("end");
            return 1;
        }
        else {
            return n * f(n - 1);
        }
    }

}
