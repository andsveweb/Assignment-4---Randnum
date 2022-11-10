import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // Scanner object for user input

        System.out.print("Hur många slumptal i intervallet 0 - 999 önskas? ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {

        } else if (input.hasNextDouble()) {
            System.out.println("Du måste ange ett heltal!");
            main(args);

            // if user press enter without entering a number
        } else if (input.hasNextLine()) {
            System.out.println("Du måste ange ett heltal!");
            main(args);
        } else {
            System.out.println("Du måste ange ett heltal!");
            main(args);
        }
        // if user not input anything and press enter start over

        int num = input.nextInt();

        System.out.println();

        Random rand = new Random();

        int[] numbers = new int[num];

        try {
            for (int i = 0; i < num; i++) {
                numbers[i] = Math.abs(rand.nextInt() % 1000);
            }
        } catch (Exception e) {
            System.out.println("Felaktig inmatning! Välj ett tal mellan 0 och 999.");
            main(args);
        }

        // Printing the random numbers
        System.out.println("Här är de slumpade talen: ");
        for (int i = 0; i < num; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // store the even numbers in a new array "even"
        System.out.println();
        int[] even = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (numbers[i] % 2 == 0) {
                even[count] = numbers[i];
                count++;
            }
        }
        // store the odd numbers in a new array "odd"
        int[] odd = new int[num];
        count = 0;
        for (int i = 0; i < num; i++) {
            if (numbers[i] % 2 != 0) {
                odd[count] = numbers[i];
                count++;
            }
        }

        // for loop for sorting the even numbers in ascending order
        System.out.println("Här är de slumpade talen ordnade: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (even[i] < even[j]) {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }

        // for loop for sorting the odd numbers in descending order
        System.out.print("- ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (odd[i] > odd[j]) {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (odd[i] != 0) {

                System.out.print(odd[i] + " ");
            }
        }
        // Printing the total numers and counting the even numbers and odd numbers and
        // print out the result
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < num; i++) {
            if (even[i] != 0) {
                evenCount++;
            }
            if (odd[i] != 0) {
                oddCount++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Av ovanstående " + num + " tal var " + evenCount + " jämna och " + oddCount + " udda.");
        main(args);
        input.close();
    }

}
