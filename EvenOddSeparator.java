import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSeparator {
    private int[] arr;
    private int[] evenArr;
    private int[] oddArr;

    public EvenOddSeparator(int[] arr) {
        this.arr = arr;
        separateEvenOdd();
    }

    private void separateEvenOdd() {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        evenArr = new int[evenCount];
        oddArr = new int[oddCount];
        evenCount = 0;
        oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenCount++] = arr[i];
            } else {
                oddArr[oddCount++] = arr[i];
            }
        }
    }

    public void printEvenArray() {
        System.out.print("Even elements: ");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();
    }

    public void printOddArray() {
        System.out.print("Odd elements: ");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        EvenOddSeparator separator = new EvenOddSeparator(arr);
        separator.printEvenArray();
        separator.printOddArray();
    }
}
