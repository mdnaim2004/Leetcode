class Fibonacci {
    public int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int result = f.Fib(5);
        System.out.println("Fibonacci number : " + result);
    }
}
