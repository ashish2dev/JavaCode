import java.util.Scanner;

public class MyClass {
    public boolean numberIsPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyClass test = new MyClass();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of primes to be displayed: ");
        int num = userInput.nextInt();

        int count = 0;
        for (int i = 2; count < num; i++) {
            if (test.numberIsPrime(i)) {
                System.out.print(i + " ");
                count++;
            }

        }
    }
}
