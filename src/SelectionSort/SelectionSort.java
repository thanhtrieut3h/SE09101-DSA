package SelectionSort;

public class SelectionSort {
    public static void selectionSortExample(int[] arr) {
        // arr : mang can sap xep
        int n = arr.length; // so luong phan tu cua mang
        for (int i = 0; i < n - 1; i++){
            // giả sử phần tử đầu tiên trong mảng chưa sắp xếp là phần tử nhỏ nhất.
            int minIndex = i;
            // Tìm phần tử nhỏ nhất trong đoạn từ i + 1 đến n - 1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // thay doi vi tri cua phan tu nho nhat, neu con phan tu khac nho hon
                }
            }
            // đổi chỗ phần tử nhỏ nhất vừa tìm được với phần tử đầu tiên trong đoạn chưa được sắp xếp(i)
            if (minIndex != i) {
                // doi cho
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
