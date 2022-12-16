package FibonacciNumber;

public class fibonacciNumber {
    public static void main(String[] args){
        System.out.println(fibonacciNumber(100));
    }
        private static long fibonacciNumber ( int n){
            long[] arr = new long[n + 1];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i <= n; i++)
                arr[i] = arr[i - 1] + arr[i - 2];
            return arr[n];
        }

    }

