package SearchAlg;

public class Main {
    public static void main(String[] args){
        System.out.println("++++++++++ Tim kiem tuyen tinh +++++++++++");
        int[] numbers = {10, 5, 15, 20, 3 ,6, 9, 21, 33, 50};
        int element = 67;
        LinearSearch search = new LinearSearch();
        int postion = search.linearSearchDemo(numbers, element);
        if (postion == -1) {
            System.out.println(element + " khong tim thay trong mang");
        } else {
            System.out.println(element + " Tim thay o vi tri so " + postion + " trong mang");
        }
        System.out.println("++++++++++ Tim kiem nhi phan +++++++++++");
        int[] arrNumbers = {1,2,3,4,5,6,7,8,9}; // mang phai duoc sap xep san roi
        int target = 20;
        int s = BinarySearch.binarySearchDemo(arrNumbers, target);
        if (s == -1){
            System.out.println(target + " khong tim thay trong mang bang TKNP");
        } else {
            System.out.println(target + " tim thay o vi tri so " + s +" trong mang bang TKNP");
        }
    }
}
