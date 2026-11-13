package BubbleSort;

public class BubbleSort {
    public static void bubbleSortExample(int[] myArray){
        // muc dich : sap xep cac phan tu trong mang myArray theo mot trat tu
        int count = myArray.length; // dem so luong phan tu trong mang
        boolean swapped; // bien nhan biet viec doi cho (hoan doi vi tri) cac phan tu
        for (int i = 0; i < count - 1; i++) {
            swapped = false; // kiem tra xem viec hoan doi - sap xep da hoan thanh chua
            for (int j = 0; j < count - i - 1; j++) {
                // neu phan tu dung truoc lon hon phan tu dung sau -> doi cho 2 phan tu cho nhau
                if (myArray[j] > myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break; // khong con lan doi cho nao nua - mang da sap xep xong thi thoat vong lap
            }
        }
    }
}
