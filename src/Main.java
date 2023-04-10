// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




        int sum = calculateSum(0, 100);
        System.out.println("The sum of numbers from 0 to 100 is: " + sum);
        int sum2 = calculateSum(1, 21, 7);
        System.out.println("The sum of numbers divisible by 7 from 1 to 21 is: " + sum2);

    }

    public static int calculateSum(int start, int end) {
        if (start == end) {
            System.out.println(start);
            return start;
        }
        else {
            System.out.println(start);
            return start + calculateSum(start + 1, end);
        }

    }

    public static int calculateSum(int start, int end, int divisor) {
        if (start == end) {
            System.out.println(start);
            return (start % divisor == 0) ? start : 0;
        }

        else {
            int currentSum = (start % divisor == 0) ? start : 0;
            System.out.println(start);
            return currentSum + calculateSum(start + 1, end, divisor);
        }
    }
}


