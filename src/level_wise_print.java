public class level_wise_print {
    static void level_print(bst.node p,int ind){
        if(p==null){
            return ;
        }
        if(ind%2==0){
            System.out.print(p.val+" ");
        }
        level_print(p.left,ind+1);
        level_print(p.right,ind+1);
    }

    static void print_even_levels(bst.node p){
        level_print(p,1);
    }

    static void print_odd_levels(bst.node p){
        level_print(p,0);
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

        print_even_levels(p);

        System.out.println();

        print_odd_levels(p);
    }

}
