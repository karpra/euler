public class Problem1 {
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //Find the sum of all the multiples of 3 or 5 below 1000.
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                result = result + i;
                //System.out.println("number is" + i);
            }
        }
        System.out.println("result is " + result);
    }
}
