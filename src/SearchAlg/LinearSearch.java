package SearchAlg;

public class LinearSearch {
    public int linearSearchDemo(int[] arr, int element){
        // tim kiem phan tu "element" co nam trong mang "arr" hay ko?
        int count = arr.length; // dem so luong phan tu trong mang
        for (int i = 0; i < count; i++){
            if (arr[i] == element) {
                return i; // tra ve vi tri cua phan tu tim thay trong mang
            }
        }
        return -1; // khong tim thay phan tu trong mang
    }
}
