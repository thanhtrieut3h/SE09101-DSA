package Tree;

public class Main {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(); // khoi tao doi tuong CNP
        // chèn các phần tử : 1,2,3,4,5,6,7
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        // duyet cay nhi phan
        System.out.println("Duyet truoc(pre-order : Goc -> trai -> phai) ");
        tree.preOrderTree(tree.root);

        System.out.println("======= Ki Thuat duyet cay Nhi Phan ===========");
        BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();
        // thiet lap 1 cay nhi phan
        treeTraversal.root = new TreeNode(1); // node goc
        treeTraversal.root.left = new TreeNode(2); // con ben trai
        treeTraversal.root.right = new TreeNode(3);
        treeTraversal.root.left.left = new TreeNode(4);
        treeTraversal.root.left.right = new TreeNode(5);
        treeTraversal.root.right.left = new TreeNode(6);
        treeTraversal.root.right.right = new TreeNode(7);
        System.out.println("======== 1. PreOrder =========");
        treeTraversal.preOrder(treeTraversal.root);
        System.out.println("==============================");
        System.out.println("======== 2. InOrder ==========");
        treeTraversal.inOrder(treeTraversal.root);
        System.out.println("==============================");
        System.out.println("=======  3. PostOrder ========");
        treeTraversal.postOrder(treeTraversal.root);
        System.out.println("==============================");
    }
}
