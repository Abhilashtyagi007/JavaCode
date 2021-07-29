import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number of term in fibonacci series :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = fib(x);
        System.out.println(res);
    }

    public static int fib(int n) {
        if(n==0 || n==1) return n;

        return fib(n-1) + fib(n-2);
    }
}
