public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int f1 = 0, f2 = 1;
        int f3;
        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            f3 = f1 + f2;
            f1 = f2;      
            f2 = f3;      
        }
    }
}           
