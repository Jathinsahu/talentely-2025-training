public class no_of_levels {
    static int levels(bst.node p){
        if(p==null){
            return 0;
        }
        if (p.left==null&&p.right==null){
            return 1;
        }else {
            return 1 + Math.max(levels(p.left),levels(p.right));
        }
    }

    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 34);
        bst.insert(tree, 12);
        bst.insert(tree, 56);
        bst.insert(tree, 78);
        bst.insert(tree, 3);
        bst.insert(tree, 2);
        bst.insert(tree, 6);
        bst.insert(tree, 79);
        bst.insert(tree, 69);
        bst.insert(tree, 11);
        bst.insert(tree, 46);
        bst.insert(tree, 23);


        System.out.println(levels(tree.root));
    }

}
