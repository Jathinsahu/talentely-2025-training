public class vertical_print {

    static int calculate_min_level(bst.node p,int val){
        if (p==null){
            return val;
        }
        if(p.left != null){
            val = Math.min(calculate_min_level(p.left,val-1),val);
        }
        if(p.right != null){
            val = Math.min(calculate_min_level(p.right,val+1),val);
        }
        return val;
    }

    static int calculate_max_level(bst.node p,int val){
        if (p==null){
            return val;
        }
        if(p.left != null){
            val = Math.max(calculate_max_level(p.left,val-1),val);
        }
        if(p.right != null){
            val = Math.max(calculate_max_level(p.right,val+1),val);
        }
        return val;
    }

    static void print_by_vertical(bst.node p,int lvl){
        if(p==null){
            return;
        }
        if(lvl==0){
            System.out.print(p.val+" ");
        }
        if(p.left != null){
            print_by_vertical(p.left,lvl-1);
        }
        if(p.right != null){
            print_by_vertical(p.right,lvl+1);
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
        int mini = calculate_min_level(p,0);
        int maxi = calculate_max_level(p,0);
        //int size = maxi-mini+1;
        for(int i=maxi;i>=mini;i--){
            print_by_vertical(p,i);
            System.out.println();
        }
    }


}
