package QuickSort;

public class Main {
    public static void main(String[] args){
        int[] arrNumbers = { 10, 7, 8, 9, 1, 5 };
        QuickSort.quickSortDemo(arrNumbers, 0, arrNumbers.length -1);
        System.out.println("Mang sau khi duoc sap xep la : ");
        for (int n : arrNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
