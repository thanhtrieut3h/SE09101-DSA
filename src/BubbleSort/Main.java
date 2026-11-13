package BubbleSort;

public class Main {
    public static void main(String[] args){
        int[] numbers = {34, 10, 56, 79, 20, 6, 90 , 81};
        // sap xep mang nay tang dan
        BubbleSort.bubbleSortExample(numbers);
        System.out.println("Mang sau khi sap xep la");
        for (int n : numbers){
            System.out.print(n + " "); // moi so cach nhau khoang trang
        }
    }
}
