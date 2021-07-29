public class Expoential {
    public static void main(String[] args) {
        int res = exp(6);
        System.out.println(res);
    }

    // public static int exp(int n) {
    //     if(n==0) return 1;

    //     return 2*exp(n-1);
    // }

    public static int exp(int n) {
        if(n==0) return 1;

        int res = exp(n/2);
        if(n%2 ==1){
            return 2*res*res;
        }else{
            return res*res;
        }

        
    }
}
