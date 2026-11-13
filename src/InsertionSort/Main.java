package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12,11,13,5,8,7,6,9};
        // sap xep mang nay
        InsertionSort.insertionSortExample(numbers);
        System.out.println("Mang sau khi sap xep la : ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
