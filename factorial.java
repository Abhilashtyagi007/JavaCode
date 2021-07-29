import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = fact(x);
        System.out.println(res);
    }
    public static int fact(int n) {
        if(n==0 || n==1) return 1;

        return n * fact(n-1);
    }
}
