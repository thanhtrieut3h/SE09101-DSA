package BST;

public class Main {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        // chen cac phan tu vao cay BST
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) {
            bst.insert(val);
        }
        // duyet cay : Left - Root - Right
        System.out.println(" ========= Duyet cay: Inorder =============");
        bst.inorder();
        System.out.println();
        System.out.println("=========== het phan duyet cay =============");
        System.out.println("============ tim kiem ====================");
        int target = 400;
        if (bst.search(target)) {
            System.out.println("Da tim thay gia tri " + target + " trong BST");
        } else {
            System.out.println("Khong tim thay gia tri " + target + " trong BST");
        }
        System.out.println("============ Het tim kiem ====================");
    }
}
