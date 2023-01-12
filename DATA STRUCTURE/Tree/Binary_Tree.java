
package Tree;
import java.util.Scanner;

public class Binary_Tree {

    private class Node {

        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public Binary_Tree()
    {
        root = CreateTree();
    }

    private Node CreateTree()
    {

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        boolean hlc = sc.nextBoolean();

        if (hlc) {
            nn.left = CreateTree();
        }

        boolean hrc = sc.nextBoolean();

        if (hrc) {
            nn.right = CreateTree();
        }

        return nn;
    }

    public void display()
    {
        Display(root);
    }
    
    private void Display(Node node)
    {

        if (node == null) {
            return;
        }

        String s = "";

        s = "<-- " + s + node.val + " -->";

        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }

        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);

        Display(node.left);
        Display(node.right);

    }
    
    private void PreOrder(Node root)
    {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    
    public void preorder()
    {
        PreOrder(root);
    }

    private void PostOrder(Node root) {
        if (root == null) {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);

        System.out.print(root.val + " ");
    }

    public void postorder() {
        PostOrder(root);
    }

    private void InOrder(Node root) {
        if (root == null) {
            return;
        }

        PostOrder(root.left);
        System.out.print(root.val + " ");
        PostOrder(root.right);

      
    }

    public void Iostorder() {
        InOrder(root);
    }
    
}
