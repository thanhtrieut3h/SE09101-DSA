package InsertionSort;

public class InsertionSort {
    public static void insertionSortExample(int[] arr){
        // arr : mang can sap xep
        int length = arr.length; // so luong phan tu
        for (int i = 0; i < length; i++){
            int key = arr[i]; //luu tru(danh dau) gia cac phan tu can chen
            int j = i - 1;
            // Dịch chuyển các phần tử lơn hơn phần tử "key" sang phải một vị trí.
            // lặp lại công việc nay cho đến khi hết các phần tử cần chèn
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            // chèn key vào vị trí trống thích hợp
            arr[j+1] = key;
        }
    }
}
