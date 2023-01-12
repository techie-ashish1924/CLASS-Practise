package Tree;

public class BinaryTree_Client {

    public static void main(String[] args) {
        
        Binary_Tree bt = new Binary_Tree();
        // bt.display();

        bt.preorder();
        System.out.println();
        bt.postorder();
        System.out.println();
        bt.Iostorder();

        System.out.println();
        System.out.println(bt.search(-40));
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    }
    
}
