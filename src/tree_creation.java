public class tree_creation {
    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 8);
        bst.insert(tree, 5);
        bst.insert(tree, 9);
        bst.insert(tree, 4);
        bst.insert(tree, 7);
        bst.insert(tree, 14);
        bst.insert(tree, 6);
        bst.insert(tree, 10);
        bst.insert(tree, 12);
        bst.insert(tree, 13);

        System.out.println("Inorder Traversal:");
        bst.display(tree.root);
        System.out.println("NULL");
    }
}
