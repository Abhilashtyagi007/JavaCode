import java.util.Scanner;

class counting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to count:");
        int x = sc.nextInt();
        count(x);
    }

    public static void count(int n ) {
        if(n==0) return;

        count(n-1);
        System.out.println(n);
    }
}