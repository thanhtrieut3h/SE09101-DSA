package MergeSort;

import static MergeSort.MergeSort.mergeSort;

public class Main {
    // Driver code
    public static void main(String args[]){

        int arr[] = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length - 1);

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
