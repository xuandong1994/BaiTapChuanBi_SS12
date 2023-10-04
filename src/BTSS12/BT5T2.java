package BTSS12;

public class BT5T2 {

    //Đặt current trỏ tới root
    //Lặp các bước sau đến khi current là null hoặc phần tử tìm thấy khớp với current.element
    //Nếu element nhỏ hơn current.element, gán current.left cho current
    //Nếu element lớn hơn current.element, gán current.right cho current
    //Nếu elemenet bằng current.element, trả về true. Nếu current là null, cây con trống và element không được tìm thấy trong cây.
    private Node root;

    public BT5T2() {
        root = null;
    }

    public boolean search(int element) {
        Node current = root;
        while (current != null) {
            if (element == current.value) {
                return true;
            } else if (element < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public static void main(String[] args) {
        BT5T2 tree = new BT5T2();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 7);


        System.out.println(tree.search(10));
        System.out.println(tree.search(5));
        System.out.println(tree.search(15));
        System.out.println(tree.search(2));
        System.out.println(tree.search(7));
        System.out.println(tree.search(12));
        System.out.println(tree.search(1));
        System.out.println(tree.search(20));
    }


}

