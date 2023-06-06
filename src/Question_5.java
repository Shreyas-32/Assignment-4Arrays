public class Question_5 {
    public static int arrangeCoins(int n) {
        int k = 0;

        while (k * (k + 1L) / 2 <= n) {
            k++;
        }

        return k - 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
    }
}
