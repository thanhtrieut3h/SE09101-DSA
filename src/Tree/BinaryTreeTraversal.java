package Tree;

public class BinaryTreeTraversal {
    TreeNode root;

    // 1 : Root - Left - Right (Goc - Trai - Phai)
    public void preOrder(TreeNode node){
        if (node == null) return; // cay khong co gi ca
        System.out.print(node.data + " -> "); //
        preOrder(node.left); // Đệ quy
        preOrder(node.right); // Đệ quy
    }
    // 2 : Left - Root - Right (Trai - Goc - Phai)
    public void inOrder(TreeNode node){
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " -> ");
        inOrder(node.right);
    }
    // 3 : Left - Right - Root (Trai - Phai - Goc)
    public void postOrder(TreeNode node){
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " -> ");
    }
}
