package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root; // root node
    public BinaryTree(){
        root = null;
    }
    // chèn phần tử vào cây nhị phân(vào vị trí trống đầu tiên theo tầng)
    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        if (root == null){
            root = newNode;
            return;
        }
        //sử dụng Queue và Linked List tạo các cây con nhị phân bên trong nút gốc
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // them nut goc
        // them cac nut con ben trai va phai
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            // kiem tra nut con ben trai
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }
            // kiem tra nut con ben phai
            if (temp.right == null){
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }
    }
    // duyet cay nhi phan
    // 1 -> Duyet truoc : Pre-order : goc -> trai -> phai
    public void preOrderTree(TreeNode node){
        if (node == null) return;
        System.out.print(node.data + " ");
        // de quy de hien thi
        preOrderTree(node.left);
        preOrderTree(node.right);
    }
}
