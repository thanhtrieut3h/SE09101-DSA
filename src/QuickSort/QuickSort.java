package QuickSort;

public class QuickSort {
    public static void quickSortDemo(int arr[], int low, int hight){
        // arr : mang can sap xep
        // low : vi tri cua phan tu dau tien
        // hight : vi tri cua phan tu cuoi cung
        if (low < hight) {
            // duyet mang
            // phan hoach tach va chia mang
            int p = partition(arr, low, hight); // vi tri cua phan tu lam pivot
            // de quy de sap cac phan tu nam ben trai va phai so voi pivot
            quickSortDemo(arr, low, p -1); // sap xep sang trai pivot
            quickSortDemo(arr, p + 1, hight); // sap xep sang phai pivot
        }
    }
    public static int partition(int arr[], int low, int hight){
        // chon phan tu cuoi cung lam moc : pivot
        int pivot = arr[hight];
        // tao mot bien luu tru vi tri ranh gioi cua cac phan tu nho pivot
        int i = (low - 1);
        for (int j = low; j < hight; j++){
            if (arr[j] <= pivot) {
                i++;
                // doi cho phan tu
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // dua pivot ve dung vi tri o giua (dung ngay sau cac phan tu nho hon no)
        int temp = arr[i+1];
        arr[i+1] = arr[hight];
        arr[hight] = temp;
        return i + 1; // vi tri cua phan tu pivot (phan tu moc de so sanh)
    }
}
