import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    private int[] arr;

    public ArraySorter(int[] arr) {
        this.arr = arr;
        Arrays.sort(this.arr);
    }

    public void printArray() {
        System.out.print("Array elements in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

        ArraySorter sorter = new ArraySorter(arr);
        sorter.printArray();
    }
}
