public class Problem10 {
    public static int findgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findgcd(b,a%b);
    }
}
