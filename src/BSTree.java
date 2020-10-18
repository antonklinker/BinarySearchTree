public class BSTree {
    Node root;
    public void insert(Node in) {
        if (root==null) {
            root=in;
            return;
        } else {
            insert(in, root);
        }
    }

    public void insert(Node in, Node parent) {
        if (in.data.compareTo(parent.data)>=0) {
            if (parent.rightChild==null) {
                parent.rightChild=in;
            } else {
                insert(in, parent.rightChild);
            }
        }
        if (in.data.compareTo(parent.data)<0) {
            if (parent.leftChild==null) {
                parent.leftChild=in;
            } else {
                insert(in, parent.leftChild);
            }
        }
    }

    public void DFSInOrder() {
        System.out.println("    In order DFS: ");
        DFSInOrder(root);
    }

    public void DFSInOrder(Node n) {
        if (n==null) {
            return;
        }
        DFSInOrder(n.leftChild);
        System.out.println(n.data);
        DFSInOrder(n.rightChild);
    }

    public void DFSPreOrder() {
        System.out.println("    Pre order DFS: ");
        DFSPreOrder(root);
    }

    public void DFSPreOrder(Node n) {
        if (n==null) {
            return;
        }
        System.out.println(n.data);
        DFSPreOrder(n.leftChild);
        DFSPreOrder(n.rightChild);
    }

    public void DFSPostOrder() {
        System.out.println("    Post order DFS: ");
        DFSPostOrder(root);
    }

    public void DFSPostOrder (Node n) {
        if (n==null) {
            return;
        }
        DFSPostOrder(n.leftChild);
        DFSPostOrder(n.rightChild);
        System.out.println(n.data);
    }
}

class Node <T extends Comparable<T>> {
    T data;
    Node leftChild = null;
    Node rightChild = null;
    Node(T data) {
        this.data = data;
    }
}
