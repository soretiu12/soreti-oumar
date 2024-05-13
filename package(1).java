import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        
        int count = 0;
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        
        if (count > 0) {
            System.out.println(target + " is present in the array " + count + " time(s).");
        } else {
            System.out.println(target + " is not present in the array.");
        }

        scanner.close();
    }
}
