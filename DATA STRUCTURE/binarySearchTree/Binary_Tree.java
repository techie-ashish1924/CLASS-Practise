package binarySearchTree;

public class Binary_Tree {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public Binary_Tree(int []in)
    {
        this.root = CreateTree(in, 0, in.length - 1);
    }

    public Node CreateTree(int[] in,int si,int ei)
    {
        if (si > ei) {
            return null;
        }

        int mid = (si + ei) / 2;

        Node nn = new Node();
        nn.val = in[mid];
        nn.left = CreateTree(in, si, mid - 1);
        nn.right = CreateTree(in, mid + 1, ei);

        return nn;
    }
    

    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node node) {
        // TODO Auto-generated method stub
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);

    }

    public static void main(String[] args) {
        
        int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        Binary_Tree ob = new Binary_Tree(in);
        ob.PreOrder();
    }
    
}
