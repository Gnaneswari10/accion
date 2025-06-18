public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(123);
        System.out.println(result);

    }
    public int reverse(int x) {
        int reversed = 0;
        int digits = 0;
        while (x != 0) {
            digits = x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE /10) {

                return 0;
            }
            reversed = reversed * 10 + digits;
        }
        return reversed;
    }

}
