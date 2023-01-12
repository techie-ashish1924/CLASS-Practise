package Tree;

public class BinaryTree_Client {

    public static void main(String[] args) {
        
        Binary_Tree bt = new Binary_Tree();
        // bt.display();
        System.out.println("\n Preorder traversal : ");
        bt.preorder();
        System.out.println("\n Post Order traversal : ");
        bt.postorder();
        System.out.println("\n Inorder traversal : ");
        bt.Inorder();

        System.out.println();
        System.out.println("Element is present or not : " + bt.search(-40));
        System.out.println("maximum value of tree : " + bt.Max());

        System.out.println("HEight of treee  : " + bt.Height());
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    }
    
}
