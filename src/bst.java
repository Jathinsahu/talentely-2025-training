class bst {
    bst.node root;



    static class node{
        int val;
        node left;
        node right;
        node(int d){
            val=d;
            left=null;
            right=null;
        }
    }

    public static bst insert(bst tree, int val) {
        node newNode = new node(val);

        if (tree.root == null) {
            tree.root = newNode;
            return tree;
        }
        else {

            node current = tree.root;
            node parent = null;

            while (current != null) {
                parent = current;
                if (val < current.val) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            if (val < parent.val) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }

        return tree;
    }

    public static void display(node root){
        if (root != null){
            display(root.left);
            System.out.print(root.val+" -> ");
            display(root.right);
        }
    //    System.out.print("\b\b\b");
    }

}
