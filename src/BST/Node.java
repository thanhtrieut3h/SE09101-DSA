package BST;

public class Node {
    // lop dai dien cho mot nut (Node) trong cay
    int key; // gia tri cua nut(node)
    Node left, right;
    public Node(int item){
        // tao cac nut
        key = item;
        left = right = null;
    }
}
