public class PrintByLevel {
    static void level(bst.node p,int level){
        if(level ==1){
            System.out.print(p.val+" ");
            return;
        }
        if(level < 1){
            return;
        }

        if (p.left != null){
            level(p.left,level-1);
        }
        if (p.right != null){
            level(p.right,level-1);
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

        bst.node p = tree.root;
        level(p,4);

    }
}
