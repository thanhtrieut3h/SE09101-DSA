package SelectionSort;

public class Main {
    public static void main(String[] args){
        int[] numbers = {99,101,34,56,87,210,197};
        SelectionSort.selectionSortExample(numbers);
        System.out.println("Mang sau khi duoc sap xep la : ");
        for (int n : numbers){
            System.out.print(n + " ");
        }
    }
}
