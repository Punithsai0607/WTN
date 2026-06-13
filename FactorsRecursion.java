import java.util.Scanner;

public class FactorsRecursion {

    static void factors(int n, int i) {
        if (i > n)
            return;

        if (n % i == 0)
            System.out.print(i + " ");

        factors(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Factors: ");
        factors(n, 1);
    }
}