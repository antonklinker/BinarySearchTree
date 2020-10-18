public class Main {
    public static void main(String[] args) {
        BSTree BST = new BSTree();
        BST.insert(new Node("love"));
        BST.insert(new Node("datastructures"));
        BST.insert(new Node("trees"));
        BST.insert(new Node("binary"));
        BST.insert(new Node("we"));
        BST.insert(new Node("and"));

        BST.DFSInOrder();
        BST.DFSPreOrder();
        BST.DFSPostOrder();
    }
}
