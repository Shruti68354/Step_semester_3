 public class SumNaturalNumbers {

    public static void main(String[] args) {

        int n = 5;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }
}   

