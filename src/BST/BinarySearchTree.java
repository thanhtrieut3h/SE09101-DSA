package BST;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root = null;
    }
    // dung - tao - them cac node vao BST
    public void insert(int key){
        root = insertBST(root, key);
    }
    private Node insertBST(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // neu key nho hon node goc(hien tai), them sang trai
        if (key < root.key) {
            // de quy
            root.left = insertBST(root.left, key);
        }
        // neu key lon hon node goc hien tai, them sang ben phai
        else if (key > root.key) {
            // de quy
            root.right = insertBST(root.right, key);
        }
        return root;
    }
    public boolean search(int key){
        return searchBST(root, key) != null;
    }
    private Node searchBST(Node root, int key){
        // 1- gia tri tim kiem chinh bang node goc
        if (root == null || root.key == key){
            return root;
        }
        // neu gia tri can tim nho hon node goc, tim o cay con ben trai
        if (root.key > key) {
            return searchBST(root.left, key); // tim de quy
        }
        // neu gia tri can tim lon hon node goc, tim o cay con ben phai
        return searchBST(root.right, key);
    }
    // duyet cay: In-Order : Left - Root- Right
    public void inorder(){
        inorderBST(root);
    }
    private void inorderBST(Node root){
        if (root != null) {
            inorderBST(root.left); // duyet xong tat cay con ben trai
            System.out.print(root.key + " -> "); // tham node goc
            inorderBST(root.right); // duyet tat ca cay con ben phai
        }
    }
}
