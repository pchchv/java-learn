package exs;

public class fibonacci {
    /**
     * Generation of the Fibonacci sequence to a Nth number
     */
    public static void main(String [] args) {
        int sequenceLength = 111;
        long num0 = 0;
        long num1 = 1;
        long temp;
        for (int i = 0; i < sequenceLength-1; i++) {
            System.out.print(num0 + ", ");
            temp = num0;
            num0 = num1;
            num1 += temp;
        }
        System.out.print(num0);
    }
}
