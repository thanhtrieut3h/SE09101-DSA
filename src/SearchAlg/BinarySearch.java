package SearchAlg;

public class BinarySearch {
    public static int binarySearchDemo(int[] arr, int target){
        // tim kiem phan tu "target" co nam trong mang "arr" hay ko?
        // De ap dung thuat toan nay, bat buong mang "arr" phai duoc sap xep roi.
        // di tim phan tu o giua mang
        int left = 0; // vi tri dau mang
        int right = arr.length - 1; // vi tri cuoi mang
        while (left <= right){
            // tim phan tu o giua
            int mid = (left + right) / 2; // mang co so luong phan tu it
            // int mid = left + (right - left) / 2; // mang co so luong phan tu rat nhieu
            // 1 - kiem tra phan tu o giua nay co bang phan tu can tim ko ?
            if (arr[mid] == target){
                return mid; // tra ve vi tri phan tu can tim
            }
            // kiem tra phan tu o giua co nho hon phan tu can tim ko?
            if (arr[mid] < target) {
                // tim ben phai
                left = mid + 1;
            } else {
                // tim ben trai
                right = mid - 1;
            }
        }
        // khong tim thay
        return -1;
    }
}
