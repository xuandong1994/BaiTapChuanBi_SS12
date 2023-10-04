package BTSS12;

public class BTT4 {


        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.println(root.value);
        }

        public static void main(String[] args) {
            Node root = new Node(27);
            root.left = new Node(14);
            root.right = new Node(35);
            root.left.left = new Node(10);
            root.left.right = new Node(19);
            root.right.left = new Node(31);
            root.right.right = new Node(42);

            postorder(root);
        }

}
